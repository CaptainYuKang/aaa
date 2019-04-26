package com.platform.app.member.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblOccupationCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblOccupationCategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBigCategoryIsNull() {
            addCriterion("BIG_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andBigCategoryIsNotNull() {
            addCriterion("BIG_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andBigCategoryEqualTo(String value) {
            addCriterion("BIG_CATEGORY =", value, "bigCategory");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNotEqualTo(String value) {
            addCriterion("BIG_CATEGORY <>", value, "bigCategory");
            return (Criteria) this;
        }

        public Criteria andBigCategoryGreaterThan(String value) {
            addCriterion("BIG_CATEGORY >", value, "bigCategory");
            return (Criteria) this;
        }

        public Criteria andBigCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("BIG_CATEGORY >=", value, "bigCategory");
            return (Criteria) this;
        }

        public Criteria andBigCategoryLessThan(String value) {
            addCriterion("BIG_CATEGORY <", value, "bigCategory");
            return (Criteria) this;
        }

        public Criteria andBigCategoryLessThanOrEqualTo(String value) {
            addCriterion("BIG_CATEGORY <=", value, "bigCategory");
            return (Criteria) this;
        }

        public Criteria andBigCategoryLike(String value) {
            addCriterion("BIG_CATEGORY like", value, "bigCategory");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNotLike(String value) {
            addCriterion("BIG_CATEGORY not like", value, "bigCategory");
            return (Criteria) this;
        }

        public Criteria andBigCategoryIn(List<String> values) {
            addCriterion("BIG_CATEGORY in", values, "bigCategory");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNotIn(List<String> values) {
            addCriterion("BIG_CATEGORY not in", values, "bigCategory");
            return (Criteria) this;
        }

        public Criteria andBigCategoryBetween(String value1, String value2) {
            addCriterion("BIG_CATEGORY between", value1, value2, "bigCategory");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNotBetween(String value1, String value2) {
            addCriterion("BIG_CATEGORY not between", value1, value2, "bigCategory");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNameIsNull() {
            addCriterion("BIG_CATEGORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNameIsNotNull() {
            addCriterion("BIG_CATEGORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNameEqualTo(String value) {
            addCriterion("BIG_CATEGORY_NAME =", value, "bigCategoryName");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNameNotEqualTo(String value) {
            addCriterion("BIG_CATEGORY_NAME <>", value, "bigCategoryName");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNameGreaterThan(String value) {
            addCriterion("BIG_CATEGORY_NAME >", value, "bigCategoryName");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("BIG_CATEGORY_NAME >=", value, "bigCategoryName");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNameLessThan(String value) {
            addCriterion("BIG_CATEGORY_NAME <", value, "bigCategoryName");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("BIG_CATEGORY_NAME <=", value, "bigCategoryName");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNameLike(String value) {
            addCriterion("BIG_CATEGORY_NAME like", value, "bigCategoryName");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNameNotLike(String value) {
            addCriterion("BIG_CATEGORY_NAME not like", value, "bigCategoryName");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNameIn(List<String> values) {
            addCriterion("BIG_CATEGORY_NAME in", values, "bigCategoryName");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNameNotIn(List<String> values) {
            addCriterion("BIG_CATEGORY_NAME not in", values, "bigCategoryName");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNameBetween(String value1, String value2) {
            addCriterion("BIG_CATEGORY_NAME between", value1, value2, "bigCategoryName");
            return (Criteria) this;
        }

        public Criteria andBigCategoryNameNotBetween(String value1, String value2) {
            addCriterion("BIG_CATEGORY_NAME not between", value1, value2, "bigCategoryName");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryIsNull() {
            addCriterion("MEDIUM_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryIsNotNull() {
            addCriterion("MEDIUM_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryEqualTo(String value) {
            addCriterion("MEDIUM_CATEGORY =", value, "mediumCategory");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNotEqualTo(String value) {
            addCriterion("MEDIUM_CATEGORY <>", value, "mediumCategory");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryGreaterThan(String value) {
            addCriterion("MEDIUM_CATEGORY >", value, "mediumCategory");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIUM_CATEGORY >=", value, "mediumCategory");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryLessThan(String value) {
            addCriterion("MEDIUM_CATEGORY <", value, "mediumCategory");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryLessThanOrEqualTo(String value) {
            addCriterion("MEDIUM_CATEGORY <=", value, "mediumCategory");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryLike(String value) {
            addCriterion("MEDIUM_CATEGORY like", value, "mediumCategory");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNotLike(String value) {
            addCriterion("MEDIUM_CATEGORY not like", value, "mediumCategory");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryIn(List<String> values) {
            addCriterion("MEDIUM_CATEGORY in", values, "mediumCategory");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNotIn(List<String> values) {
            addCriterion("MEDIUM_CATEGORY not in", values, "mediumCategory");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryBetween(String value1, String value2) {
            addCriterion("MEDIUM_CATEGORY between", value1, value2, "mediumCategory");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNotBetween(String value1, String value2) {
            addCriterion("MEDIUM_CATEGORY not between", value1, value2, "mediumCategory");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNameIsNull() {
            addCriterion("MEDIUM_CATEGORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNameIsNotNull() {
            addCriterion("MEDIUM_CATEGORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNameEqualTo(String value) {
            addCriterion("MEDIUM_CATEGORY_NAME =", value, "mediumCategoryName");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNameNotEqualTo(String value) {
            addCriterion("MEDIUM_CATEGORY_NAME <>", value, "mediumCategoryName");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNameGreaterThan(String value) {
            addCriterion("MEDIUM_CATEGORY_NAME >", value, "mediumCategoryName");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIUM_CATEGORY_NAME >=", value, "mediumCategoryName");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNameLessThan(String value) {
            addCriterion("MEDIUM_CATEGORY_NAME <", value, "mediumCategoryName");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("MEDIUM_CATEGORY_NAME <=", value, "mediumCategoryName");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNameLike(String value) {
            addCriterion("MEDIUM_CATEGORY_NAME like", value, "mediumCategoryName");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNameNotLike(String value) {
            addCriterion("MEDIUM_CATEGORY_NAME not like", value, "mediumCategoryName");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNameIn(List<String> values) {
            addCriterion("MEDIUM_CATEGORY_NAME in", values, "mediumCategoryName");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNameNotIn(List<String> values) {
            addCriterion("MEDIUM_CATEGORY_NAME not in", values, "mediumCategoryName");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNameBetween(String value1, String value2) {
            addCriterion("MEDIUM_CATEGORY_NAME between", value1, value2, "mediumCategoryName");
            return (Criteria) this;
        }

        public Criteria andMediumCategoryNameNotBetween(String value1, String value2) {
            addCriterion("MEDIUM_CATEGORY_NAME not between", value1, value2, "mediumCategoryName");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryIsNull() {
            addCriterion("SMALL_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryIsNotNull() {
            addCriterion("SMALL_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryEqualTo(String value) {
            addCriterion("SMALL_CATEGORY =", value, "smallCategory");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNotEqualTo(String value) {
            addCriterion("SMALL_CATEGORY <>", value, "smallCategory");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryGreaterThan(String value) {
            addCriterion("SMALL_CATEGORY >", value, "smallCategory");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("SMALL_CATEGORY >=", value, "smallCategory");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryLessThan(String value) {
            addCriterion("SMALL_CATEGORY <", value, "smallCategory");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryLessThanOrEqualTo(String value) {
            addCriterion("SMALL_CATEGORY <=", value, "smallCategory");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryLike(String value) {
            addCriterion("SMALL_CATEGORY like", value, "smallCategory");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNotLike(String value) {
            addCriterion("SMALL_CATEGORY not like", value, "smallCategory");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryIn(List<String> values) {
            addCriterion("SMALL_CATEGORY in", values, "smallCategory");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNotIn(List<String> values) {
            addCriterion("SMALL_CATEGORY not in", values, "smallCategory");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryBetween(String value1, String value2) {
            addCriterion("SMALL_CATEGORY between", value1, value2, "smallCategory");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNotBetween(String value1, String value2) {
            addCriterion("SMALL_CATEGORY not between", value1, value2, "smallCategory");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNameIsNull() {
            addCriterion("SMALL_CATEGORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNameIsNotNull() {
            addCriterion("SMALL_CATEGORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNameEqualTo(String value) {
            addCriterion("SMALL_CATEGORY_NAME =", value, "smallCategoryName");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNameNotEqualTo(String value) {
            addCriterion("SMALL_CATEGORY_NAME <>", value, "smallCategoryName");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNameGreaterThan(String value) {
            addCriterion("SMALL_CATEGORY_NAME >", value, "smallCategoryName");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("SMALL_CATEGORY_NAME >=", value, "smallCategoryName");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNameLessThan(String value) {
            addCriterion("SMALL_CATEGORY_NAME <", value, "smallCategoryName");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("SMALL_CATEGORY_NAME <=", value, "smallCategoryName");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNameLike(String value) {
            addCriterion("SMALL_CATEGORY_NAME like", value, "smallCategoryName");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNameNotLike(String value) {
            addCriterion("SMALL_CATEGORY_NAME not like", value, "smallCategoryName");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNameIn(List<String> values) {
            addCriterion("SMALL_CATEGORY_NAME in", values, "smallCategoryName");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNameNotIn(List<String> values) {
            addCriterion("SMALL_CATEGORY_NAME not in", values, "smallCategoryName");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNameBetween(String value1, String value2) {
            addCriterion("SMALL_CATEGORY_NAME between", value1, value2, "smallCategoryName");
            return (Criteria) this;
        }

        public Criteria andSmallCategoryNameNotBetween(String value1, String value2) {
            addCriterion("SMALL_CATEGORY_NAME not between", value1, value2, "smallCategoryName");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierTimeIsNull() {
            addCriterion("MODIFIER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifierTimeIsNotNull() {
            addCriterion("MODIFIER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifierTimeEqualTo(Date value) {
            addCriterion("MODIFIER_TIME =", value, "modifierTime");
            return (Criteria) this;
        }

        public Criteria andModifierTimeNotEqualTo(Date value) {
            addCriterion("MODIFIER_TIME <>", value, "modifierTime");
            return (Criteria) this;
        }

        public Criteria andModifierTimeGreaterThan(Date value) {
            addCriterion("MODIFIER_TIME >", value, "modifierTime");
            return (Criteria) this;
        }

        public Criteria andModifierTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFIER_TIME >=", value, "modifierTime");
            return (Criteria) this;
        }

        public Criteria andModifierTimeLessThan(Date value) {
            addCriterion("MODIFIER_TIME <", value, "modifierTime");
            return (Criteria) this;
        }

        public Criteria andModifierTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFIER_TIME <=", value, "modifierTime");
            return (Criteria) this;
        }

        public Criteria andModifierTimeIn(List<Date> values) {
            addCriterion("MODIFIER_TIME in", values, "modifierTime");
            return (Criteria) this;
        }

        public Criteria andModifierTimeNotIn(List<Date> values) {
            addCriterion("MODIFIER_TIME not in", values, "modifierTime");
            return (Criteria) this;
        }

        public Criteria andModifierTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFIER_TIME between", value1, value2, "modifierTime");
            return (Criteria) this;
        }

        public Criteria andModifierTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFIER_TIME not between", value1, value2, "modifierTime");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIsNull() {
            addCriterion("BATCH_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIsNotNull() {
            addCriterion("BATCH_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNumberEqualTo(String value) {
            addCriterion("BATCH_NUMBER =", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotEqualTo(String value) {
            addCriterion("BATCH_NUMBER <>", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberGreaterThan(String value) {
            addCriterion("BATCH_NUMBER >", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_NUMBER >=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLessThan(String value) {
            addCriterion("BATCH_NUMBER <", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLessThanOrEqualTo(String value) {
            addCriterion("BATCH_NUMBER <=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLike(String value) {
            addCriterion("BATCH_NUMBER like", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotLike(String value) {
            addCriterion("BATCH_NUMBER not like", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIn(List<String> values) {
            addCriterion("BATCH_NUMBER in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotIn(List<String> values) {
            addCriterion("BATCH_NUMBER not in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberBetween(String value1, String value2) {
            addCriterion("BATCH_NUMBER between", value1, value2, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotBetween(String value1, String value2) {
            addCriterion("BATCH_NUMBER not between", value1, value2, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}