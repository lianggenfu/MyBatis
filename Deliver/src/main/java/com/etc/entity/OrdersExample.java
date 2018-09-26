package com.etc.entity;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andDeliveryidIsNull() {
            addCriterion("deliveryId is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryidIsNotNull() {
            addCriterion("deliveryId is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryidEqualTo(Integer value) {
            addCriterion("deliveryId =", value, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidNotEqualTo(Integer value) {
            addCriterion("deliveryId <>", value, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidGreaterThan(Integer value) {
            addCriterion("deliveryId >", value, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliveryId >=", value, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidLessThan(Integer value) {
            addCriterion("deliveryId <", value, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidLessThanOrEqualTo(Integer value) {
            addCriterion("deliveryId <=", value, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidIn(List<Integer> values) {
            addCriterion("deliveryId in", values, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidNotIn(List<Integer> values) {
            addCriterion("deliveryId not in", values, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidBetween(Integer value1, Integer value2) {
            addCriterion("deliveryId between", value1, value2, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidNotBetween(Integer value1, Integer value2) {
            addCriterion("deliveryId not between", value1, value2, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSendnameIsNull() {
            addCriterion("sendName is null");
            return (Criteria) this;
        }

        public Criteria andSendnameIsNotNull() {
            addCriterion("sendName is not null");
            return (Criteria) this;
        }

        public Criteria andSendnameEqualTo(String value) {
            addCriterion("sendName =", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotEqualTo(String value) {
            addCriterion("sendName <>", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameGreaterThan(String value) {
            addCriterion("sendName >", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameGreaterThanOrEqualTo(String value) {
            addCriterion("sendName >=", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameLessThan(String value) {
            addCriterion("sendName <", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameLessThanOrEqualTo(String value) {
            addCriterion("sendName <=", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameLike(String value) {
            addCriterion("sendName like", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotLike(String value) {
            addCriterion("sendName not like", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameIn(List<String> values) {
            addCriterion("sendName in", values, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotIn(List<String> values) {
            addCriterion("sendName not in", values, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameBetween(String value1, String value2) {
            addCriterion("sendName between", value1, value2, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotBetween(String value1, String value2) {
            addCriterion("sendName not between", value1, value2, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendaddIsNull() {
            addCriterion("sendAdd is null");
            return (Criteria) this;
        }

        public Criteria andSendaddIsNotNull() {
            addCriterion("sendAdd is not null");
            return (Criteria) this;
        }

        public Criteria andSendaddEqualTo(String value) {
            addCriterion("sendAdd =", value, "sendadd");
            return (Criteria) this;
        }

        public Criteria andSendaddNotEqualTo(String value) {
            addCriterion("sendAdd <>", value, "sendadd");
            return (Criteria) this;
        }

        public Criteria andSendaddGreaterThan(String value) {
            addCriterion("sendAdd >", value, "sendadd");
            return (Criteria) this;
        }

        public Criteria andSendaddGreaterThanOrEqualTo(String value) {
            addCriterion("sendAdd >=", value, "sendadd");
            return (Criteria) this;
        }

        public Criteria andSendaddLessThan(String value) {
            addCriterion("sendAdd <", value, "sendadd");
            return (Criteria) this;
        }

        public Criteria andSendaddLessThanOrEqualTo(String value) {
            addCriterion("sendAdd <=", value, "sendadd");
            return (Criteria) this;
        }

        public Criteria andSendaddLike(String value) {
            addCriterion("sendAdd like", value, "sendadd");
            return (Criteria) this;
        }

        public Criteria andSendaddNotLike(String value) {
            addCriterion("sendAdd not like", value, "sendadd");
            return (Criteria) this;
        }

        public Criteria andSendaddIn(List<String> values) {
            addCriterion("sendAdd in", values, "sendadd");
            return (Criteria) this;
        }

        public Criteria andSendaddNotIn(List<String> values) {
            addCriterion("sendAdd not in", values, "sendadd");
            return (Criteria) this;
        }

        public Criteria andSendaddBetween(String value1, String value2) {
            addCriterion("sendAdd between", value1, value2, "sendadd");
            return (Criteria) this;
        }

        public Criteria andSendaddNotBetween(String value1, String value2) {
            addCriterion("sendAdd not between", value1, value2, "sendadd");
            return (Criteria) this;
        }

        public Criteria andSenddetailaddIsNull() {
            addCriterion("sendDetailAdd is null");
            return (Criteria) this;
        }

        public Criteria andSenddetailaddIsNotNull() {
            addCriterion("sendDetailAdd is not null");
            return (Criteria) this;
        }

        public Criteria andSenddetailaddEqualTo(String value) {
            addCriterion("sendDetailAdd =", value, "senddetailadd");
            return (Criteria) this;
        }

        public Criteria andSenddetailaddNotEqualTo(String value) {
            addCriterion("sendDetailAdd <>", value, "senddetailadd");
            return (Criteria) this;
        }

        public Criteria andSenddetailaddGreaterThan(String value) {
            addCriterion("sendDetailAdd >", value, "senddetailadd");
            return (Criteria) this;
        }

        public Criteria andSenddetailaddGreaterThanOrEqualTo(String value) {
            addCriterion("sendDetailAdd >=", value, "senddetailadd");
            return (Criteria) this;
        }

        public Criteria andSenddetailaddLessThan(String value) {
            addCriterion("sendDetailAdd <", value, "senddetailadd");
            return (Criteria) this;
        }

        public Criteria andSenddetailaddLessThanOrEqualTo(String value) {
            addCriterion("sendDetailAdd <=", value, "senddetailadd");
            return (Criteria) this;
        }

        public Criteria andSenddetailaddLike(String value) {
            addCriterion("sendDetailAdd like", value, "senddetailadd");
            return (Criteria) this;
        }

        public Criteria andSenddetailaddNotLike(String value) {
            addCriterion("sendDetailAdd not like", value, "senddetailadd");
            return (Criteria) this;
        }

        public Criteria andSenddetailaddIn(List<String> values) {
            addCriterion("sendDetailAdd in", values, "senddetailadd");
            return (Criteria) this;
        }

        public Criteria andSenddetailaddNotIn(List<String> values) {
            addCriterion("sendDetailAdd not in", values, "senddetailadd");
            return (Criteria) this;
        }

        public Criteria andSenddetailaddBetween(String value1, String value2) {
            addCriterion("sendDetailAdd between", value1, value2, "senddetailadd");
            return (Criteria) this;
        }

        public Criteria andSenddetailaddNotBetween(String value1, String value2) {
            addCriterion("sendDetailAdd not between", value1, value2, "senddetailadd");
            return (Criteria) this;
        }

        public Criteria andSendphoneIsNull() {
            addCriterion("sendPhone is null");
            return (Criteria) this;
        }

        public Criteria andSendphoneIsNotNull() {
            addCriterion("sendPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSendphoneEqualTo(String value) {
            addCriterion("sendPhone =", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotEqualTo(String value) {
            addCriterion("sendPhone <>", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneGreaterThan(String value) {
            addCriterion("sendPhone >", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneGreaterThanOrEqualTo(String value) {
            addCriterion("sendPhone >=", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLessThan(String value) {
            addCriterion("sendPhone <", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLessThanOrEqualTo(String value) {
            addCriterion("sendPhone <=", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLike(String value) {
            addCriterion("sendPhone like", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotLike(String value) {
            addCriterion("sendPhone not like", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneIn(List<String> values) {
            addCriterion("sendPhone in", values, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotIn(List<String> values) {
            addCriterion("sendPhone not in", values, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneBetween(String value1, String value2) {
            addCriterion("sendPhone between", value1, value2, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotBetween(String value1, String value2) {
            addCriterion("sendPhone not between", value1, value2, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendpostcodeIsNull() {
            addCriterion("sendPostcode is null");
            return (Criteria) this;
        }

        public Criteria andSendpostcodeIsNotNull() {
            addCriterion("sendPostcode is not null");
            return (Criteria) this;
        }

        public Criteria andSendpostcodeEqualTo(String value) {
            addCriterion("sendPostcode =", value, "sendpostcode");
            return (Criteria) this;
        }

        public Criteria andSendpostcodeNotEqualTo(String value) {
            addCriterion("sendPostcode <>", value, "sendpostcode");
            return (Criteria) this;
        }

        public Criteria andSendpostcodeGreaterThan(String value) {
            addCriterion("sendPostcode >", value, "sendpostcode");
            return (Criteria) this;
        }

        public Criteria andSendpostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("sendPostcode >=", value, "sendpostcode");
            return (Criteria) this;
        }

        public Criteria andSendpostcodeLessThan(String value) {
            addCriterion("sendPostcode <", value, "sendpostcode");
            return (Criteria) this;
        }

        public Criteria andSendpostcodeLessThanOrEqualTo(String value) {
            addCriterion("sendPostcode <=", value, "sendpostcode");
            return (Criteria) this;
        }

        public Criteria andSendpostcodeLike(String value) {
            addCriterion("sendPostcode like", value, "sendpostcode");
            return (Criteria) this;
        }

        public Criteria andSendpostcodeNotLike(String value) {
            addCriterion("sendPostcode not like", value, "sendpostcode");
            return (Criteria) this;
        }

        public Criteria andSendpostcodeIn(List<String> values) {
            addCriterion("sendPostcode in", values, "sendpostcode");
            return (Criteria) this;
        }

        public Criteria andSendpostcodeNotIn(List<String> values) {
            addCriterion("sendPostcode not in", values, "sendpostcode");
            return (Criteria) this;
        }

        public Criteria andSendpostcodeBetween(String value1, String value2) {
            addCriterion("sendPostcode between", value1, value2, "sendpostcode");
            return (Criteria) this;
        }

        public Criteria andSendpostcodeNotBetween(String value1, String value2) {
            addCriterion("sendPostcode not between", value1, value2, "sendpostcode");
            return (Criteria) this;
        }

        public Criteria andAcceptnameIsNull() {
            addCriterion("acceptName is null");
            return (Criteria) this;
        }

        public Criteria andAcceptnameIsNotNull() {
            addCriterion("acceptName is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptnameEqualTo(String value) {
            addCriterion("acceptName =", value, "acceptname");
            return (Criteria) this;
        }

        public Criteria andAcceptnameNotEqualTo(String value) {
            addCriterion("acceptName <>", value, "acceptname");
            return (Criteria) this;
        }

        public Criteria andAcceptnameGreaterThan(String value) {
            addCriterion("acceptName >", value, "acceptname");
            return (Criteria) this;
        }

        public Criteria andAcceptnameGreaterThanOrEqualTo(String value) {
            addCriterion("acceptName >=", value, "acceptname");
            return (Criteria) this;
        }

        public Criteria andAcceptnameLessThan(String value) {
            addCriterion("acceptName <", value, "acceptname");
            return (Criteria) this;
        }

        public Criteria andAcceptnameLessThanOrEqualTo(String value) {
            addCriterion("acceptName <=", value, "acceptname");
            return (Criteria) this;
        }

        public Criteria andAcceptnameLike(String value) {
            addCriterion("acceptName like", value, "acceptname");
            return (Criteria) this;
        }

        public Criteria andAcceptnameNotLike(String value) {
            addCriterion("acceptName not like", value, "acceptname");
            return (Criteria) this;
        }

        public Criteria andAcceptnameIn(List<String> values) {
            addCriterion("acceptName in", values, "acceptname");
            return (Criteria) this;
        }

        public Criteria andAcceptnameNotIn(List<String> values) {
            addCriterion("acceptName not in", values, "acceptname");
            return (Criteria) this;
        }

        public Criteria andAcceptnameBetween(String value1, String value2) {
            addCriterion("acceptName between", value1, value2, "acceptname");
            return (Criteria) this;
        }

        public Criteria andAcceptnameNotBetween(String value1, String value2) {
            addCriterion("acceptName not between", value1, value2, "acceptname");
            return (Criteria) this;
        }

        public Criteria andAcceptaddIsNull() {
            addCriterion("acceptAdd is null");
            return (Criteria) this;
        }

        public Criteria andAcceptaddIsNotNull() {
            addCriterion("acceptAdd is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptaddEqualTo(String value) {
            addCriterion("acceptAdd =", value, "acceptadd");
            return (Criteria) this;
        }

        public Criteria andAcceptaddNotEqualTo(String value) {
            addCriterion("acceptAdd <>", value, "acceptadd");
            return (Criteria) this;
        }

        public Criteria andAcceptaddGreaterThan(String value) {
            addCriterion("acceptAdd >", value, "acceptadd");
            return (Criteria) this;
        }

        public Criteria andAcceptaddGreaterThanOrEqualTo(String value) {
            addCriterion("acceptAdd >=", value, "acceptadd");
            return (Criteria) this;
        }

        public Criteria andAcceptaddLessThan(String value) {
            addCriterion("acceptAdd <", value, "acceptadd");
            return (Criteria) this;
        }

        public Criteria andAcceptaddLessThanOrEqualTo(String value) {
            addCriterion("acceptAdd <=", value, "acceptadd");
            return (Criteria) this;
        }

        public Criteria andAcceptaddLike(String value) {
            addCriterion("acceptAdd like", value, "acceptadd");
            return (Criteria) this;
        }

        public Criteria andAcceptaddNotLike(String value) {
            addCriterion("acceptAdd not like", value, "acceptadd");
            return (Criteria) this;
        }

        public Criteria andAcceptaddIn(List<String> values) {
            addCriterion("acceptAdd in", values, "acceptadd");
            return (Criteria) this;
        }

        public Criteria andAcceptaddNotIn(List<String> values) {
            addCriterion("acceptAdd not in", values, "acceptadd");
            return (Criteria) this;
        }

        public Criteria andAcceptaddBetween(String value1, String value2) {
            addCriterion("acceptAdd between", value1, value2, "acceptadd");
            return (Criteria) this;
        }

        public Criteria andAcceptaddNotBetween(String value1, String value2) {
            addCriterion("acceptAdd not between", value1, value2, "acceptadd");
            return (Criteria) this;
        }

        public Criteria andAcceptdetailaddIsNull() {
            addCriterion("acceptDetailAdd is null");
            return (Criteria) this;
        }

        public Criteria andAcceptdetailaddIsNotNull() {
            addCriterion("acceptDetailAdd is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptdetailaddEqualTo(String value) {
            addCriterion("acceptDetailAdd =", value, "acceptdetailadd");
            return (Criteria) this;
        }

        public Criteria andAcceptdetailaddNotEqualTo(String value) {
            addCriterion("acceptDetailAdd <>", value, "acceptdetailadd");
            return (Criteria) this;
        }

        public Criteria andAcceptdetailaddGreaterThan(String value) {
            addCriterion("acceptDetailAdd >", value, "acceptdetailadd");
            return (Criteria) this;
        }

        public Criteria andAcceptdetailaddGreaterThanOrEqualTo(String value) {
            addCriterion("acceptDetailAdd >=", value, "acceptdetailadd");
            return (Criteria) this;
        }

        public Criteria andAcceptdetailaddLessThan(String value) {
            addCriterion("acceptDetailAdd <", value, "acceptdetailadd");
            return (Criteria) this;
        }

        public Criteria andAcceptdetailaddLessThanOrEqualTo(String value) {
            addCriterion("acceptDetailAdd <=", value, "acceptdetailadd");
            return (Criteria) this;
        }

        public Criteria andAcceptdetailaddLike(String value) {
            addCriterion("acceptDetailAdd like", value, "acceptdetailadd");
            return (Criteria) this;
        }

        public Criteria andAcceptdetailaddNotLike(String value) {
            addCriterion("acceptDetailAdd not like", value, "acceptdetailadd");
            return (Criteria) this;
        }

        public Criteria andAcceptdetailaddIn(List<String> values) {
            addCriterion("acceptDetailAdd in", values, "acceptdetailadd");
            return (Criteria) this;
        }

        public Criteria andAcceptdetailaddNotIn(List<String> values) {
            addCriterion("acceptDetailAdd not in", values, "acceptdetailadd");
            return (Criteria) this;
        }

        public Criteria andAcceptdetailaddBetween(String value1, String value2) {
            addCriterion("acceptDetailAdd between", value1, value2, "acceptdetailadd");
            return (Criteria) this;
        }

        public Criteria andAcceptdetailaddNotBetween(String value1, String value2) {
            addCriterion("acceptDetailAdd not between", value1, value2, "acceptdetailadd");
            return (Criteria) this;
        }

        public Criteria andAcceptphoneIsNull() {
            addCriterion("acceptPhone is null");
            return (Criteria) this;
        }

        public Criteria andAcceptphoneIsNotNull() {
            addCriterion("acceptPhone is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptphoneEqualTo(String value) {
            addCriterion("acceptPhone =", value, "acceptphone");
            return (Criteria) this;
        }

        public Criteria andAcceptphoneNotEqualTo(String value) {
            addCriterion("acceptPhone <>", value, "acceptphone");
            return (Criteria) this;
        }

        public Criteria andAcceptphoneGreaterThan(String value) {
            addCriterion("acceptPhone >", value, "acceptphone");
            return (Criteria) this;
        }

        public Criteria andAcceptphoneGreaterThanOrEqualTo(String value) {
            addCriterion("acceptPhone >=", value, "acceptphone");
            return (Criteria) this;
        }

        public Criteria andAcceptphoneLessThan(String value) {
            addCriterion("acceptPhone <", value, "acceptphone");
            return (Criteria) this;
        }

        public Criteria andAcceptphoneLessThanOrEqualTo(String value) {
            addCriterion("acceptPhone <=", value, "acceptphone");
            return (Criteria) this;
        }

        public Criteria andAcceptphoneLike(String value) {
            addCriterion("acceptPhone like", value, "acceptphone");
            return (Criteria) this;
        }

        public Criteria andAcceptphoneNotLike(String value) {
            addCriterion("acceptPhone not like", value, "acceptphone");
            return (Criteria) this;
        }

        public Criteria andAcceptphoneIn(List<String> values) {
            addCriterion("acceptPhone in", values, "acceptphone");
            return (Criteria) this;
        }

        public Criteria andAcceptphoneNotIn(List<String> values) {
            addCriterion("acceptPhone not in", values, "acceptphone");
            return (Criteria) this;
        }

        public Criteria andAcceptphoneBetween(String value1, String value2) {
            addCriterion("acceptPhone between", value1, value2, "acceptphone");
            return (Criteria) this;
        }

        public Criteria andAcceptphoneNotBetween(String value1, String value2) {
            addCriterion("acceptPhone not between", value1, value2, "acceptphone");
            return (Criteria) this;
        }

        public Criteria andAcceptpostcodeIsNull() {
            addCriterion("acceptPostcode is null");
            return (Criteria) this;
        }

        public Criteria andAcceptpostcodeIsNotNull() {
            addCriterion("acceptPostcode is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptpostcodeEqualTo(String value) {
            addCriterion("acceptPostcode =", value, "acceptpostcode");
            return (Criteria) this;
        }

        public Criteria andAcceptpostcodeNotEqualTo(String value) {
            addCriterion("acceptPostcode <>", value, "acceptpostcode");
            return (Criteria) this;
        }

        public Criteria andAcceptpostcodeGreaterThan(String value) {
            addCriterion("acceptPostcode >", value, "acceptpostcode");
            return (Criteria) this;
        }

        public Criteria andAcceptpostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("acceptPostcode >=", value, "acceptpostcode");
            return (Criteria) this;
        }

        public Criteria andAcceptpostcodeLessThan(String value) {
            addCriterion("acceptPostcode <", value, "acceptpostcode");
            return (Criteria) this;
        }

        public Criteria andAcceptpostcodeLessThanOrEqualTo(String value) {
            addCriterion("acceptPostcode <=", value, "acceptpostcode");
            return (Criteria) this;
        }

        public Criteria andAcceptpostcodeLike(String value) {
            addCriterion("acceptPostcode like", value, "acceptpostcode");
            return (Criteria) this;
        }

        public Criteria andAcceptpostcodeNotLike(String value) {
            addCriterion("acceptPostcode not like", value, "acceptpostcode");
            return (Criteria) this;
        }

        public Criteria andAcceptpostcodeIn(List<String> values) {
            addCriterion("acceptPostcode in", values, "acceptpostcode");
            return (Criteria) this;
        }

        public Criteria andAcceptpostcodeNotIn(List<String> values) {
            addCriterion("acceptPostcode not in", values, "acceptpostcode");
            return (Criteria) this;
        }

        public Criteria andAcceptpostcodeBetween(String value1, String value2) {
            addCriterion("acceptPostcode between", value1, value2, "acceptpostcode");
            return (Criteria) this;
        }

        public Criteria andAcceptpostcodeNotBetween(String value1, String value2) {
            addCriterion("acceptPostcode not between", value1, value2, "acceptpostcode");
            return (Criteria) this;
        }

        public Criteria andIsinsuranceIsNull() {
            addCriterion("isInsurance is null");
            return (Criteria) this;
        }

        public Criteria andIsinsuranceIsNotNull() {
            addCriterion("isInsurance is not null");
            return (Criteria) this;
        }

        public Criteria andIsinsuranceEqualTo(String value) {
            addCriterion("isInsurance =", value, "isinsurance");
            return (Criteria) this;
        }

        public Criteria andIsinsuranceNotEqualTo(String value) {
            addCriterion("isInsurance <>", value, "isinsurance");
            return (Criteria) this;
        }

        public Criteria andIsinsuranceGreaterThan(String value) {
            addCriterion("isInsurance >", value, "isinsurance");
            return (Criteria) this;
        }

        public Criteria andIsinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("isInsurance >=", value, "isinsurance");
            return (Criteria) this;
        }

        public Criteria andIsinsuranceLessThan(String value) {
            addCriterion("isInsurance <", value, "isinsurance");
            return (Criteria) this;
        }

        public Criteria andIsinsuranceLessThanOrEqualTo(String value) {
            addCriterion("isInsurance <=", value, "isinsurance");
            return (Criteria) this;
        }

        public Criteria andIsinsuranceLike(String value) {
            addCriterion("isInsurance like", value, "isinsurance");
            return (Criteria) this;
        }

        public Criteria andIsinsuranceNotLike(String value) {
            addCriterion("isInsurance not like", value, "isinsurance");
            return (Criteria) this;
        }

        public Criteria andIsinsuranceIn(List<String> values) {
            addCriterion("isInsurance in", values, "isinsurance");
            return (Criteria) this;
        }

        public Criteria andIsinsuranceNotIn(List<String> values) {
            addCriterion("isInsurance not in", values, "isinsurance");
            return (Criteria) this;
        }

        public Criteria andIsinsuranceBetween(String value1, String value2) {
            addCriterion("isInsurance between", value1, value2, "isinsurance");
            return (Criteria) this;
        }

        public Criteria andIsinsuranceNotBetween(String value1, String value2) {
            addCriterion("isInsurance not between", value1, value2, "isinsurance");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIsNull() {
            addCriterion("insurancePrice is null");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIsNotNull() {
            addCriterion("insurancePrice is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceEqualTo(Integer value) {
            addCriterion("insurancePrice =", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotEqualTo(Integer value) {
            addCriterion("insurancePrice <>", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceGreaterThan(Integer value) {
            addCriterion("insurancePrice >", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("insurancePrice >=", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceLessThan(Integer value) {
            addCriterion("insurancePrice <", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceLessThanOrEqualTo(Integer value) {
            addCriterion("insurancePrice <=", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIn(List<Integer> values) {
            addCriterion("insurancePrice in", values, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotIn(List<Integer> values) {
            addCriterion("insurancePrice not in", values, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceBetween(Integer value1, Integer value2) {
            addCriterion("insurancePrice between", value1, value2, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotBetween(Integer value1, Integer value2) {
            addCriterion("insurancePrice not between", value1, value2, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(Integer value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Integer value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Integer value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Integer value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Integer> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Integer> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Integer value1, Integer value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Float value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Float value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Float value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Float value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Float value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Float> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Float> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Float value1, Float value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Float value1, Float value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTransportationIsNull() {
            addCriterion("transportation is null");
            return (Criteria) this;
        }

        public Criteria andTransportationIsNotNull() {
            addCriterion("transportation is not null");
            return (Criteria) this;
        }

        public Criteria andTransportationEqualTo(Integer value) {
            addCriterion("transportation =", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotEqualTo(Integer value) {
            addCriterion("transportation <>", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationGreaterThan(Integer value) {
            addCriterion("transportation >", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationGreaterThanOrEqualTo(Integer value) {
            addCriterion("transportation >=", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationLessThan(Integer value) {
            addCriterion("transportation <", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationLessThanOrEqualTo(Integer value) {
            addCriterion("transportation <=", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationIn(List<Integer> values) {
            addCriterion("transportation in", values, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotIn(List<Integer> values) {
            addCriterion("transportation not in", values, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationBetween(Integer value1, Integer value2) {
            addCriterion("transportation between", value1, value2, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotBetween(Integer value1, Integer value2) {
            addCriterion("transportation not between", value1, value2, "transportation");
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