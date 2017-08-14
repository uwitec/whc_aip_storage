package com.whc.aip.storage.model.storage;

import java.util.ArrayList;
import java.util.List;

public class WeigateDoorRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeigateDoorRecordExample() {
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

        public Criteria andDoreIdIsNull() {
            addCriterion("DORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDoreIdIsNotNull() {
            addCriterion("DORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDoreIdEqualTo(String value) {
            addCriterion("DORE_ID =", value, "doreId");
            return (Criteria) this;
        }

        public Criteria andDoreIdNotEqualTo(String value) {
            addCriterion("DORE_ID <>", value, "doreId");
            return (Criteria) this;
        }

        public Criteria andDoreIdGreaterThan(String value) {
            addCriterion("DORE_ID >", value, "doreId");
            return (Criteria) this;
        }

        public Criteria andDoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("DORE_ID >=", value, "doreId");
            return (Criteria) this;
        }

        public Criteria andDoreIdLessThan(String value) {
            addCriterion("DORE_ID <", value, "doreId");
            return (Criteria) this;
        }

        public Criteria andDoreIdLessThanOrEqualTo(String value) {
            addCriterion("DORE_ID <=", value, "doreId");
            return (Criteria) this;
        }

        public Criteria andDoreIdLike(String value) {
            addCriterion("DORE_ID like", value, "doreId");
            return (Criteria) this;
        }

        public Criteria andDoreIdNotLike(String value) {
            addCriterion("DORE_ID not like", value, "doreId");
            return (Criteria) this;
        }

        public Criteria andDoreIdIn(List<String> values) {
            addCriterion("DORE_ID in", values, "doreId");
            return (Criteria) this;
        }

        public Criteria andDoreIdNotIn(List<String> values) {
            addCriterion("DORE_ID not in", values, "doreId");
            return (Criteria) this;
        }

        public Criteria andDoreIdBetween(String value1, String value2) {
            addCriterion("DORE_ID between", value1, value2, "doreId");
            return (Criteria) this;
        }

        public Criteria andDoreIdNotBetween(String value1, String value2) {
            addCriterion("DORE_ID not between", value1, value2, "doreId");
            return (Criteria) this;
        }

        public Criteria andDoreUserIdIsNull() {
            addCriterion("DORE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDoreUserIdIsNotNull() {
            addCriterion("DORE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDoreUserIdEqualTo(String value) {
            addCriterion("DORE_USER_ID =", value, "doreUserId");
            return (Criteria) this;
        }

        public Criteria andDoreUserIdNotEqualTo(String value) {
            addCriterion("DORE_USER_ID <>", value, "doreUserId");
            return (Criteria) this;
        }

        public Criteria andDoreUserIdGreaterThan(String value) {
            addCriterion("DORE_USER_ID >", value, "doreUserId");
            return (Criteria) this;
        }

        public Criteria andDoreUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("DORE_USER_ID >=", value, "doreUserId");
            return (Criteria) this;
        }

        public Criteria andDoreUserIdLessThan(String value) {
            addCriterion("DORE_USER_ID <", value, "doreUserId");
            return (Criteria) this;
        }

        public Criteria andDoreUserIdLessThanOrEqualTo(String value) {
            addCriterion("DORE_USER_ID <=", value, "doreUserId");
            return (Criteria) this;
        }

        public Criteria andDoreUserIdLike(String value) {
            addCriterion("DORE_USER_ID like", value, "doreUserId");
            return (Criteria) this;
        }

        public Criteria andDoreUserIdNotLike(String value) {
            addCriterion("DORE_USER_ID not like", value, "doreUserId");
            return (Criteria) this;
        }

        public Criteria andDoreUserIdIn(List<String> values) {
            addCriterion("DORE_USER_ID in", values, "doreUserId");
            return (Criteria) this;
        }

        public Criteria andDoreUserIdNotIn(List<String> values) {
            addCriterion("DORE_USER_ID not in", values, "doreUserId");
            return (Criteria) this;
        }

        public Criteria andDoreUserIdBetween(String value1, String value2) {
            addCriterion("DORE_USER_ID between", value1, value2, "doreUserId");
            return (Criteria) this;
        }

        public Criteria andDoreUserIdNotBetween(String value1, String value2) {
            addCriterion("DORE_USER_ID not between", value1, value2, "doreUserId");
            return (Criteria) this;
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

        public Criteria andDoreTimeIsNull() {
            addCriterion("DORE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDoreTimeIsNotNull() {
            addCriterion("DORE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDoreTimeEqualTo(String value) {
            addCriterion("DORE_TIME =", value, "doreTime");
            return (Criteria) this;
        }

        public Criteria andDoreTimeNotEqualTo(String value) {
            addCriterion("DORE_TIME <>", value, "doreTime");
            return (Criteria) this;
        }

        public Criteria andDoreTimeGreaterThan(String value) {
            addCriterion("DORE_TIME >", value, "doreTime");
            return (Criteria) this;
        }

        public Criteria andDoreTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DORE_TIME >=", value, "doreTime");
            return (Criteria) this;
        }

        public Criteria andDoreTimeLessThan(String value) {
            addCriterion("DORE_TIME <", value, "doreTime");
            return (Criteria) this;
        }

        public Criteria andDoreTimeLessThanOrEqualTo(String value) {
            addCriterion("DORE_TIME <=", value, "doreTime");
            return (Criteria) this;
        }

        public Criteria andDoreTimeLike(String value) {
            addCriterion("DORE_TIME like", value, "doreTime");
            return (Criteria) this;
        }

        public Criteria andDoreTimeNotLike(String value) {
            addCriterion("DORE_TIME not like", value, "doreTime");
            return (Criteria) this;
        }

        public Criteria andDoreTimeIn(List<String> values) {
            addCriterion("DORE_TIME in", values, "doreTime");
            return (Criteria) this;
        }

        public Criteria andDoreTimeNotIn(List<String> values) {
            addCriterion("DORE_TIME not in", values, "doreTime");
            return (Criteria) this;
        }

        public Criteria andDoreTimeBetween(String value1, String value2) {
            addCriterion("DORE_TIME between", value1, value2, "doreTime");
            return (Criteria) this;
        }

        public Criteria andDoreTimeNotBetween(String value1, String value2) {
            addCriterion("DORE_TIME not between", value1, value2, "doreTime");
            return (Criteria) this;
        }

        public Criteria andDore_open_typeIsNull() {
            addCriterion("DORE_OPEN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDore_open_typeIsNotNull() {
            addCriterion("DORE_OPEN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDore_open_typeEqualTo(String value) {
            addCriterion("DORE_OPEN_TYPE =", value, "dore_open_type");
            return (Criteria) this;
        }

        public Criteria andDore_open_typeNotEqualTo(String value) {
            addCriterion("DORE_OPEN_TYPE <>", value, "dore_open_type");
            return (Criteria) this;
        }

        public Criteria andDore_open_typeGreaterThan(String value) {
            addCriterion("DORE_OPEN_TYPE >", value, "dore_open_type");
            return (Criteria) this;
        }

        public Criteria andDore_open_typeGreaterThanOrEqualTo(String value) {
            addCriterion("DORE_OPEN_TYPE >=", value, "dore_open_type");
            return (Criteria) this;
        }

        public Criteria andDore_open_typeLessThan(String value) {
            addCriterion("DORE_OPEN_TYPE <", value, "dore_open_type");
            return (Criteria) this;
        }

        public Criteria andDore_open_typeLessThanOrEqualTo(String value) {
            addCriterion("DORE_OPEN_TYPE <=", value, "dore_open_type");
            return (Criteria) this;
        }

        public Criteria andDore_open_typeLike(String value) {
            addCriterion("DORE_OPEN_TYPE like", value, "dore_open_type");
            return (Criteria) this;
        }

        public Criteria andDore_open_typeNotLike(String value) {
            addCriterion("DORE_OPEN_TYPE not like", value, "dore_open_type");
            return (Criteria) this;
        }

        public Criteria andDore_open_typeIn(List<String> values) {
            addCriterion("DORE_OPEN_TYPE in", values, "dore_open_type");
            return (Criteria) this;
        }

        public Criteria andDore_open_typeNotIn(List<String> values) {
            addCriterion("DORE_OPEN_TYPE not in", values, "dore_open_type");
            return (Criteria) this;
        }

        public Criteria andDore_open_typeBetween(String value1, String value2) {
            addCriterion("DORE_OPEN_TYPE between", value1, value2, "dore_open_type");
            return (Criteria) this;
        }

        public Criteria andDore_open_typeNotBetween(String value1, String value2) {
            addCriterion("DORE_OPEN_TYPE not between", value1, value2, "dore_open_type");
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