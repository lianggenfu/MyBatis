package com.etc.entity;

import java.util.ArrayList;
import java.util.List;

public class CourierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourierExample() {
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

        public Criteria andCuidIsNull() {
            addCriterion("cuId is null");
            return (Criteria) this;
        }

        public Criteria andCuidIsNotNull() {
            addCriterion("cuId is not null");
            return (Criteria) this;
        }

        public Criteria andCuidEqualTo(Integer value) {
            addCriterion("cuId =", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotEqualTo(Integer value) {
            addCriterion("cuId <>", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThan(Integer value) {
            addCriterion("cuId >", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cuId >=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThan(Integer value) {
            addCriterion("cuId <", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThanOrEqualTo(Integer value) {
            addCriterion("cuId <=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidIn(List<Integer> values) {
            addCriterion("cuId in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotIn(List<Integer> values) {
            addCriterion("cuId not in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidBetween(Integer value1, Integer value2) {
            addCriterion("cuId between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotBetween(Integer value1, Integer value2) {
            addCriterion("cuId not between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andCunameIsNull() {
            addCriterion("cuName is null");
            return (Criteria) this;
        }

        public Criteria andCunameIsNotNull() {
            addCriterion("cuName is not null");
            return (Criteria) this;
        }

        public Criteria andCunameEqualTo(String value) {
            addCriterion("cuName =", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotEqualTo(String value) {
            addCriterion("cuName <>", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameGreaterThan(String value) {
            addCriterion("cuName >", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameGreaterThanOrEqualTo(String value) {
            addCriterion("cuName >=", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameLessThan(String value) {
            addCriterion("cuName <", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameLessThanOrEqualTo(String value) {
            addCriterion("cuName <=", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameLike(String value) {
            addCriterion("cuName like", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotLike(String value) {
            addCriterion("cuName not like", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameIn(List<String> values) {
            addCriterion("cuName in", values, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotIn(List<String> values) {
            addCriterion("cuName not in", values, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameBetween(String value1, String value2) {
            addCriterion("cuName between", value1, value2, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotBetween(String value1, String value2) {
            addCriterion("cuName not between", value1, value2, "cuname");
            return (Criteria) this;
        }

        public Criteria andCutelIsNull() {
            addCriterion("cuTel is null");
            return (Criteria) this;
        }

        public Criteria andCutelIsNotNull() {
            addCriterion("cuTel is not null");
            return (Criteria) this;
        }

        public Criteria andCutelEqualTo(String value) {
            addCriterion("cuTel =", value, "cutel");
            return (Criteria) this;
        }

        public Criteria andCutelNotEqualTo(String value) {
            addCriterion("cuTel <>", value, "cutel");
            return (Criteria) this;
        }

        public Criteria andCutelGreaterThan(String value) {
            addCriterion("cuTel >", value, "cutel");
            return (Criteria) this;
        }

        public Criteria andCutelGreaterThanOrEqualTo(String value) {
            addCriterion("cuTel >=", value, "cutel");
            return (Criteria) this;
        }

        public Criteria andCutelLessThan(String value) {
            addCriterion("cuTel <", value, "cutel");
            return (Criteria) this;
        }

        public Criteria andCutelLessThanOrEqualTo(String value) {
            addCriterion("cuTel <=", value, "cutel");
            return (Criteria) this;
        }

        public Criteria andCutelLike(String value) {
            addCriterion("cuTel like", value, "cutel");
            return (Criteria) this;
        }

        public Criteria andCutelNotLike(String value) {
            addCriterion("cuTel not like", value, "cutel");
            return (Criteria) this;
        }

        public Criteria andCutelIn(List<String> values) {
            addCriterion("cuTel in", values, "cutel");
            return (Criteria) this;
        }

        public Criteria andCutelNotIn(List<String> values) {
            addCriterion("cuTel not in", values, "cutel");
            return (Criteria) this;
        }

        public Criteria andCutelBetween(String value1, String value2) {
            addCriterion("cuTel between", value1, value2, "cutel");
            return (Criteria) this;
        }

        public Criteria andCutelNotBetween(String value1, String value2) {
            addCriterion("cuTel not between", value1, value2, "cutel");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNull() {
            addCriterion("brandId is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandId is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(Integer value) {
            addCriterion("brandId =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(Integer value) {
            addCriterion("brandId <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(Integer value) {
            addCriterion("brandId >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("brandId >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(Integer value) {
            addCriterion("brandId <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(Integer value) {
            addCriterion("brandId <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<Integer> values) {
            addCriterion("brandId in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<Integer> values) {
            addCriterion("brandId not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(Integer value1, Integer value2) {
            addCriterion("brandId between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("brandId not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andCupwdIsNull() {
            addCriterion("cuPwd is null");
            return (Criteria) this;
        }

        public Criteria andCupwdIsNotNull() {
            addCriterion("cuPwd is not null");
            return (Criteria) this;
        }

        public Criteria andCupwdEqualTo(String value) {
            addCriterion("cuPwd =", value, "cupwd");
            return (Criteria) this;
        }

        public Criteria andCupwdNotEqualTo(String value) {
            addCriterion("cuPwd <>", value, "cupwd");
            return (Criteria) this;
        }

        public Criteria andCupwdGreaterThan(String value) {
            addCriterion("cuPwd >", value, "cupwd");
            return (Criteria) this;
        }

        public Criteria andCupwdGreaterThanOrEqualTo(String value) {
            addCriterion("cuPwd >=", value, "cupwd");
            return (Criteria) this;
        }

        public Criteria andCupwdLessThan(String value) {
            addCriterion("cuPwd <", value, "cupwd");
            return (Criteria) this;
        }

        public Criteria andCupwdLessThanOrEqualTo(String value) {
            addCriterion("cuPwd <=", value, "cupwd");
            return (Criteria) this;
        }

        public Criteria andCupwdLike(String value) {
            addCriterion("cuPwd like", value, "cupwd");
            return (Criteria) this;
        }

        public Criteria andCupwdNotLike(String value) {
            addCriterion("cuPwd not like", value, "cupwd");
            return (Criteria) this;
        }

        public Criteria andCupwdIn(List<String> values) {
            addCriterion("cuPwd in", values, "cupwd");
            return (Criteria) this;
        }

        public Criteria andCupwdNotIn(List<String> values) {
            addCriterion("cuPwd not in", values, "cupwd");
            return (Criteria) this;
        }

        public Criteria andCupwdBetween(String value1, String value2) {
            addCriterion("cuPwd between", value1, value2, "cupwd");
            return (Criteria) this;
        }

        public Criteria andCupwdNotBetween(String value1, String value2) {
            addCriterion("cuPwd not between", value1, value2, "cupwd");
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