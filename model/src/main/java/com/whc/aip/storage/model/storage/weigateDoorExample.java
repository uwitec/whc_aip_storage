package com.whc.aip.storage.model.storage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class weigateDoorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public weigateDoorExample() {
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

        public Criteria andDoorIdIsNull() {
            addCriterion("DOOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andDoorIdIsNotNull() {
            addCriterion("DOOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDoorIdEqualTo(String value) {
            addCriterion("DOOR_ID =", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdNotEqualTo(String value) {
            addCriterion("DOOR_ID <>", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdGreaterThan(String value) {
            addCriterion("DOOR_ID >", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdGreaterThanOrEqualTo(String value) {
            addCriterion("DOOR_ID >=", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdLessThan(String value) {
            addCriterion("DOOR_ID <", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdLessThanOrEqualTo(String value) {
            addCriterion("DOOR_ID <=", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdLike(String value) {
            addCriterion("DOOR_ID like", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdNotLike(String value) {
            addCriterion("DOOR_ID not like", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdIn(List<String> values) {
            addCriterion("DOOR_ID in", values, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdNotIn(List<String> values) {
            addCriterion("DOOR_ID not in", values, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdBetween(String value1, String value2) {
            addCriterion("DOOR_ID between", value1, value2, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdNotBetween(String value1, String value2) {
            addCriterion("DOOR_ID not between", value1, value2, "doorId");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNull() {
            addCriterion("COMM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNotNull() {
            addCriterion("COMM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommIdEqualTo(String value) {
            addCriterion("COMM_ID =", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotEqualTo(String value) {
            addCriterion("COMM_ID <>", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThan(String value) {
            addCriterion("COMM_ID >", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMM_ID >=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThan(String value) {
            addCriterion("COMM_ID <", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThanOrEqualTo(String value) {
            addCriterion("COMM_ID <=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLike(String value) {
            addCriterion("COMM_ID like", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotLike(String value) {
            addCriterion("COMM_ID not like", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdIn(List<String> values) {
            addCriterion("COMM_ID in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotIn(List<String> values) {
            addCriterion("COMM_ID not in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdBetween(String value1, String value2) {
            addCriterion("COMM_ID between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotBetween(String value1, String value2) {
            addCriterion("COMM_ID not between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andLatiIsNull() {
            addCriterion("DOOR_LATI is null");
            return (Criteria) this;
        }

        public Criteria andLatiIsNotNull() {
            addCriterion("DOOR_LATI is not null");
            return (Criteria) this;
        }

        public Criteria andLatiEqualTo(BigDecimal value) {
            addCriterion("DOOR_LATI =", value, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiNotEqualTo(BigDecimal value) {
            addCriterion("DOOR_LATI <>", value, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiGreaterThan(BigDecimal value) {
            addCriterion("DOOR_LATI >", value, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOOR_LATI >=", value, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiLessThan(BigDecimal value) {
            addCriterion("DOOR_LATI <", value, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOOR_LATI <=", value, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiIn(List<BigDecimal> values) {
            addCriterion("DOOR_LATI in", values, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiNotIn(List<BigDecimal> values) {
            addCriterion("DOOR_LATI not in", values, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOOR_LATI between", value1, value2, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOOR_LATI not between", value1, value2, "lati");
            return (Criteria) this;
        }

        public Criteria andLongiIsNull() {
            addCriterion("DOOR_LONGI is null");
            return (Criteria) this;
        }

        public Criteria andLongiIsNotNull() {
            addCriterion("DOOR_LONGI is not null");
            return (Criteria) this;
        }

        public Criteria andLongiEqualTo(BigDecimal value) {
            addCriterion("DOOR_LONGI =", value, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiNotEqualTo(BigDecimal value) {
            addCriterion("DOOR_LONGI <>", value, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiGreaterThan(BigDecimal value) {
            addCriterion("DOOR_LONGI >", value, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOOR_LONGI >=", value, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiLessThan(BigDecimal value) {
            addCriterion("DOOR_LONGI <", value, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOOR_LONGI <=", value, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiIn(List<BigDecimal> values) {
            addCriterion("DOOR_LONGI in", values, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiNotIn(List<BigDecimal> values) {
            addCriterion("DOOR_LONGI not in", values, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOOR_LONGI between", value1, value2, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOOR_LONGI not between", value1, value2, "longi");
            return (Criteria) this;
        }

        public Criteria andVerifyDistanceIsNull() {
            addCriterion("DOOR_VERIFY_DISTANCE is null");
            return (Criteria) this;
        }

        public Criteria andVerifyDistanceIsNotNull() {
            addCriterion("DOOR_VERIFY_DISTANCE is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyDistanceEqualTo(Long value) {
            addCriterion("DOOR_VERIFY_DISTANCE =", value, "verifyDistance");
            return (Criteria) this;
        }

        public Criteria andVerifyDistanceNotEqualTo(Long value) {
            addCriterion("DOOR_VERIFY_DISTANCE <>", value, "verifyDistance");
            return (Criteria) this;
        }

        public Criteria andVerifyDistanceGreaterThan(Long value) {
            addCriterion("DOOR_VERIFY_DISTANCE >", value, "verifyDistance");
            return (Criteria) this;
        }

        public Criteria andVerifyDistanceGreaterThanOrEqualTo(Long value) {
            addCriterion("DOOR_VERIFY_DISTANCE >=", value, "verifyDistance");
            return (Criteria) this;
        }

        public Criteria andVerifyDistanceLessThan(Long value) {
            addCriterion("DOOR_VERIFY_DISTANCE <", value, "verifyDistance");
            return (Criteria) this;
        }

        public Criteria andVerifyDistanceLessThanOrEqualTo(Long value) {
            addCriterion("DOOR_VERIFY_DISTANCE <=", value, "verifyDistance");
            return (Criteria) this;
        }

        public Criteria andVerifyDistanceIn(List<Long> values) {
            addCriterion("DOOR_VERIFY_DISTANCE in", values, "verifyDistance");
            return (Criteria) this;
        }

        public Criteria andVerifyDistanceNotIn(List<Long> values) {
            addCriterion("DOOR_VERIFY_DISTANCE not in", values, "verifyDistance");
            return (Criteria) this;
        }

        public Criteria andVerifyDistanceBetween(Long value1, Long value2) {
            addCriterion("DOOR_VERIFY_DISTANCE between", value1, value2, "verifyDistance");
            return (Criteria) this;
        }

        public Criteria andVerifyDistanceNotBetween(Long value1, Long value2) {
            addCriterion("DOOR_VERIFY_DISTANCE not between", value1, value2, "verifyDistance");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIsNull() {
            addCriterion("DEVICE_NO is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIsNotNull() {
            addCriterion("DEVICE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoEqualTo(String value) {
            addCriterion("DEVICE_NO =", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotEqualTo(String value) {
            addCriterion("DEVICE_NO <>", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThan(String value) {
            addCriterion("DEVICE_NO >", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_NO >=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThan(String value) {
            addCriterion("DEVICE_NO <", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_NO <=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLike(String value) {
            addCriterion("DEVICE_NO like", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotLike(String value) {
            addCriterion("DEVICE_NO not like", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIn(List<String> values) {
            addCriterion("DEVICE_NO in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotIn(List<String> values) {
            addCriterion("DEVICE_NO not in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoBetween(String value1, String value2) {
            addCriterion("DEVICE_NO between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotBetween(String value1, String value2) {
            addCriterion("DEVICE_NO not between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("DOOR_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("DOOR_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("DOOR_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("DOOR_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("DOOR_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DOOR_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("DOOR_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("DOOR_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("DOOR_STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("DOOR_STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("DOOR_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("DOOR_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("DOOR_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("DOOR_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("DOOR_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("DOOR_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("DOOR_ISDEL =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("DOOR_ISDEL <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("DOOR_ISDEL >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("DOOR_ISDEL >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("DOOR_ISDEL <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("DOOR_ISDEL <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("DOOR_ISDEL like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("DOOR_ISDEL not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("DOOR_ISDEL in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("DOOR_ISDEL not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("DOOR_ISDEL between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
            addCriterion("DOOR_ISDEL not between", value1, value2, "isDel");
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