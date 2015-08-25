package org.vamdc.basecolTest.dao.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.BasecolTest.dao.RefsArticlesKeywords;
import org.vamdc.BasecolTest.dao.RefsKeywordsCategories;

/**
 * Class _RefsKeywords was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _RefsKeywords extends CayenneDataObject {

    public static final String ID_KEYWORD_PROPERTY = "idKeyword";
    public static final String VALUE_PROPERTY = "value";
    public static final String REFS_ARTICLES_KEYWORDSS_PROPERTY = "refsArticlesKeywordss";
    public static final String TO_REFS_KEYWORDS_CATEGORIES_PROPERTY = "toRefsKeywordsCategories";

    public static final String ID_KEYWORD_PK_COLUMN = "idKeyword";

    public void setIdKeyword(Long idKeyword) {
        writeProperty(ID_KEYWORD_PROPERTY, idKeyword);
    }
    public Long getIdKeyword() {
        return (Long)readProperty(ID_KEYWORD_PROPERTY);
    }

    public void setValue(String value) {
        writeProperty(VALUE_PROPERTY, value);
    }
    public String getValue() {
        return (String)readProperty(VALUE_PROPERTY);
    }

    public void addToRefsArticlesKeywordss(RefsArticlesKeywords obj) {
        addToManyTarget(REFS_ARTICLES_KEYWORDSS_PROPERTY, obj, true);
    }
    public void removeFromRefsArticlesKeywordss(RefsArticlesKeywords obj) {
        removeToManyTarget(REFS_ARTICLES_KEYWORDSS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<RefsArticlesKeywords> getRefsArticlesKeywordss() {
        return (List<RefsArticlesKeywords>)readProperty(REFS_ARTICLES_KEYWORDSS_PROPERTY);
    }


    public void setToRefsKeywordsCategories(RefsKeywordsCategories toRefsKeywordsCategories) {
        setToOneTarget(TO_REFS_KEYWORDS_CATEGORIES_PROPERTY, toRefsKeywordsCategories, true);
    }

    public RefsKeywordsCategories getToRefsKeywordsCategories() {
        return (RefsKeywordsCategories)readProperty(TO_REFS_KEYWORDS_CATEGORIES_PROPERTY);
    }


}
