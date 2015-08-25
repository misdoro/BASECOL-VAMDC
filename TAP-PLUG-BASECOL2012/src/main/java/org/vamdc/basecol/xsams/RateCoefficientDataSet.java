package org.vamdc.basecol.xsams;

import org.vamdc.BasecolTest.misc.RatesTemperatureMap;
import org.vamdc.xsams.common.DataSetType;
import org.vamdc.xsams.common.TabulatedDataType;
import org.vamdc.dictionary.DataDescriptionType;

public class RateCoefficientDataSet extends DataSetType{

	public RateCoefficientDataSet(RatesTemperatureMap rates){
		
		setDataDescription(DataDescriptionType.rateCoefficient.name());

		TabulatedDataType depstable = new TabulatedDataType("K","cm3/s");
		getTabulatedDatas().add(depstable);

		depstable.setComments("Rate coefficients");
		depstable.addColumn(rates.getTemperatures(),0);
		depstable.addColumn(rates.getRates(),1);

	}

}
