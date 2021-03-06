package org.vamdc.basecol.builders;

import java.util.HashMap;
import java.util.Map;

import org.apache.cayenne.access.DataContext;
import org.apache.cayenne.exp.Expression;
import org.apache.cayenne.query.SelectQuery;
import org.vamdc.basecol.builders.states.ElementBuilder;
import org.vamdc.BasecolTest.dao.Collisions;
import org.vamdc.BasecolTest.dao.EnergyTables;
import org.vamdc.tapservice.api.RequestInterface;
import org.vamdc.dictionary.HeaderMetrics;
import org.vamdc.tapservice.query.QueryUtil;

/**
 * Class that does all the queries in the "count" way to get the output document metrics
 *
 */
public class Metrics {
	public static Map<HeaderMetrics, Object> estimate (RequestInterface request){
		Map<HeaderMetrics, Object> estimates = new HashMap<HeaderMetrics, Object>();
		
		//Estimate collisions
		Expression colExpression = CollisionalTransitionBuilder.getCayenneExpression(request);
		SelectQuery query=new SelectQuery(Collisions.class,colExpression);
		System.out.println(colExpression.toString()+"query string "+query.toString());
		Long collisions = QueryUtil.countQuery((DataContext) request.getCayenneContext(), query);
		
		if (collisions>0){
			estimates.put(HeaderMetrics.VAMDC_COUNT_COLLISIONS, collisions.intValue());
			
			/*request.setLastModified(QueryUtil.lastTimestampQuery(
					(DataContext) request.getCayenneContext(), 
					query, 
					"modificationDate"));*/
		}
		
		//Estimate species
		Expression spExpression = ElementBuilder.getExpression(request);
		SelectQuery spQuery=new SelectQuery(EnergyTables.class,spExpression);
		Long etables = QueryUtil.countQuery((DataContext) request.getCayenneContext(), spQuery);
		
		if (etables>0){
			estimates.put(HeaderMetrics.VAMDC_COUNT_SPECIES, etables.intValue());
			if (collisions==0)
			request.setLastModified(QueryUtil.lastTimestampQuery(
					(DataContext) request.getCayenneContext(), 
					spQuery, 
					"modificationDate"));
		}
		
		return estimates;
		
	}
	
	
}
