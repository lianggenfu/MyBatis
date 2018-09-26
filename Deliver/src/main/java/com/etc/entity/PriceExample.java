package com.etc.entity;

import java.util.ArrayList;
import java.util.List;

public class PriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PriceExample() {
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

        public Criteria andPriceidIsNull() {
            addCriterion("priceid is null");
            return (Criteria) this;
        }

        public Criteria andPriceidIsNotNull() {
            addCriterion("priceid is not null");
            return (Criteria) this;
        }

        public Criteria andPriceidEqualTo(Integer value) {
            addCriterion("priceid =", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidNotEqualTo(Integer value) {
            addCriterion("priceid <>", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidGreaterThan(Integer value) {
            addCriterion("priceid >", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("priceid >=", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidLessThan(Integer value) {
            addCriterion("priceid <", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidLessThanOrEqualTo(Integer value) {
            addCriterion("priceid <=", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidIn(List<Integer> values) {
            addCriterion("priceid in", values, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidNotIn(List<Integer> values) {
            addCriterion("priceid not in", values, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidBetween(Integer value1, Integer value2) {
            addCriterion("priceid between", value1, value2, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidNotBetween(Integer value1, Integer value2) {
            addCriterion("priceid not between", value1, value2, "priceid");
            return (Criteria) this;
        }

        public Criteria andStartaddIsNull() {
            addCriterion("startAdd is null");
            return (Criteria) this;
        }

        public Criteria andStartaddIsNotNull() {
            addCriterion("startAdd is not null");
            return (Criteria) this;
        }

        public Criteria andStartaddEqualTo(String value) {
            addCriterion("startAdd =", value, "startadd");
            return (Criteria) this;
        }

        public Criteria andStartaddNotEqualTo(String value) {
            addCriterion("startAdd <>", value, "startadd");
            return (Criteria) this;
        }

        public Criteria andStartaddGreaterThan(String value) {
            addCriterion("startAdd >", value, "startadd");
            return (Criteria) this;
        }

        public Criteria andStartaddGreaterThanOrEqualTo(String value) {
            addCriterion("startAdd >=", value, "startadd");
            return (Criteria) this;
        }

        public Criteria andStartaddLessThan(String value) {
            addCriterion("startAdd <", value, "startadd");
            return (Criteria) this;
        }

        public Criteria andStartaddLessThanOrEqualTo(String value) {
            addCriterion("startAdd <=", value, "startadd");
            return (Criteria) this;
        }

        public Criteria andStartaddLike(String value) {
            addCriterion("startAdd like", value, "startadd");
            return (Criteria) this;
        }

        public Criteria andStartaddNotLike(String value) {
            addCriterion("startAdd not like", value, "startadd");
            return (Criteria) this;
        }

        public Criteria andStartaddIn(List<String> values) {
            addCriterion("startAdd in", values, "startadd");
            return (Criteria) this;
        }

        public Criteria andStartaddNotIn(List<String> values) {
            addCriterion("startAdd not in", values, "startadd");
            return (Criteria) this;
        }

        public Criteria andStartaddBetween(String value1, String value2) {
            addCriterion("startAdd between", value1, value2, "startadd");
            return (Criteria) this;
        }

        public Criteria andStartaddNotBetween(String value1, String value2) {
            addCriterion("startAdd not between", value1, value2, "startadd");
            return (Criteria) this;
        }

        public Criteria andEndaddIsNull() {
            addCriterion("endAdd is null");
            return (Criteria) this;
        }

        public Criteria andEndaddIsNotNull() {
            addCriterion("endAdd is not null");
            return (Criteria) this;
        }

        public Criteria andEndaddEqualTo(String value) {
            addCriterion("endAdd =", value, "endadd");
            return (Criteria) this;
        }

        public Criteria andEndaddNotEqualTo(String value) {
            addCriterion("endAdd <>", value, "endadd");
            return (Criteria) this;
        }

        public Criteria andEndaddGreaterThan(String value) {
            addCriterion("endAdd >", value, "endadd");
            return (Criteria) this;
        }

        public Criteria andEndaddGreaterThanOrEqualTo(String value) {
            addCriterion("endAdd >=", value, "endadd");
            return (Criteria) this;
        }

        public Criteria andEndaddLessThan(String value) {
            addCriterion("endAdd <", value, "endadd");
            return (Criteria) this;
        }

        public Criteria andEndaddLessThanOrEqualTo(String value) {
            addCriterion("endAdd <=", value, "endadd");
            return (Criteria) this;
        }

        public Criteria andEndaddLike(String value) {
            addCriterion("endAdd like", value, "endadd");
            return (Criteria) this;
        }

        public Criteria andEndaddNotLike(String value) {
            addCriterion("endAdd not like", value, "endadd");
            return (Criteria) this;
        }

        public Criteria andEndaddIn(List<String> values) {
            addCriterion("endAdd in", values, "endadd");
            return (Criteria) this;
        }

        public Criteria andEndaddNotIn(List<String> values) {
            addCriterion("endAdd not in", values, "endadd");
            return (Criteria) this;
        }

        public Criteria andEndaddBetween(String value1, String value2) {
            addCriterion("endAdd between", value1, value2, "endadd");
            return (Criteria) this;
        }

        public Criteria andEndaddNotBetween(String value1, String value2) {
            addCriterion("endAdd not between", value1, value2, "endadd");
            return (Criteria) this;
        }

        public Criteria andFirstkgpriceIsNull() {
            addCriterion("firstKgPrice is null");
            return (Criteria) this;
        }

        public Criteria andFirstkgpriceIsNotNull() {
            addCriterion("firstKgPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFirstkgpriceEqualTo(Double value) {
            addCriterion("firstKgPrice =", value, "firstkgprice");
            return (Criteria) this;
        }

        public Criteria andFirstkgpriceNotEqualTo(Double value) {
            addCriterion("firstKgPrice <>", value, "firstkgprice");
            return (Criteria) this;
        }

        public Criteria andFirstkgpriceGreaterThan(Double value) {
            addCriterion("firstKgPrice >", value, "firstkgprice");
            return (Criteria) this;
        }

        public Criteria andFirstkgpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("firstKgPrice >=", value, "firstkgprice");
            return (Criteria) this;
        }

        public Criteria andFirstkgpriceLessThan(Double value) {
            addCriterion("firstKgPrice <", value, "firstkgprice");
            return (Criteria) this;
        }

        public Criteria andFirstkgpriceLessThanOrEqualTo(Double value) {
            addCriterion("firstKgPrice <=", value, "firstkgprice");
            return (Criteria) this;
        }

        public Criteria andFirstkgpriceIn(List<Double> values) {
            addCriterion("firstKgPrice in", values, "firstkgprice");
            return (Criteria) this;
        }

        public Criteria andFirstkgpriceNotIn(List<Double> values) {
            addCriterion("firstKgPrice not in", values, "firstkgprice");
            return (Criteria) this;
        }

        public Criteria andFirstkgpriceBetween(Double value1, Double value2) {
            addCriterion("firstKgPrice between", value1, value2, "firstkgprice");
            return (Criteria) this;
        }

        public Criteria andFirstkgpriceNotBetween(Double value1, Double value2) {
            addCriterion("firstKgPrice not between", value1, value2, "firstkgprice");
            return (Criteria) this;
        }

        public Criteria andPerkgpriceIsNull() {
            addCriterion("perKgprice is null");
            return (Criteria) this;
        }

        public Criteria andPerkgpriceIsNotNull() {
            addCriterion("perKgprice is not null");
            return (Criteria) this;
        }

        public Criteria andPerkgpriceEqualTo(Double value) {
            addCriterion("perKgprice =", value, "perkgprice");
            return (Criteria) this;
        }

        public Criteria andPerkgpriceNotEqualTo(Double value) {
            addCriterion("perKgprice <>", value, "perkgprice");
            return (Criteria) this;
        }

        public Criteria andPerkgpriceGreaterThan(Double value) {
            addCriterion("perKgprice >", value, "perkgprice");
            return (Criteria) this;
        }

        public Criteria andPerkgpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("perKgprice >=", value, "perkgprice");
            return (Criteria) this;
        }

        public Criteria andPerkgpriceLessThan(Double value) {
            addCriterion("perKgprice <", value, "perkgprice");
            return (Criteria) this;
        }

        public Criteria andPerkgpriceLessThanOrEqualTo(Double value) {
            addCriterion("perKgprice <=", value, "perkgprice");
            return (Criteria) this;
        }

        public Criteria andPerkgpriceIn(List<Double> values) {
            addCriterion("perKgprice in", values, "perkgprice");
            return (Criteria) this;
        }

        public Criteria andPerkgpriceNotIn(List<Double> values) {
            addCriterion("perKgprice not in", values, "perkgprice");
            return (Criteria) this;
        }

        public Criteria andPerkgpriceBetween(Double value1, Double value2) {
            addCriterion("perKgprice between", value1, value2, "perkgprice");
            return (Criteria) this;
        }

        public Criteria andPerkgpriceNotBetween(Double value1, Double value2) {
            addCriterion("perKgprice not between", value1, value2, "perkgprice");
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