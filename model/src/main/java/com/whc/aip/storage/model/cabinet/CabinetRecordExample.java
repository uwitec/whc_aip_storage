package com.whc.aip.storage.model.cabinet;

import java.util.ArrayList;
import java.util.List;

public class CabinetRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CabinetRecordExample() {
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
            addCriterion("CARE_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CARE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CARE_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CARE_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CARE_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CARE_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CARE_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CARE_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CARE_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CARE_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CARE_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CARE_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CARE_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdIsNull() {
            addCriterion("CABINET_ID is null");
            return (Criteria) this;
        }

        public Criteria andCabinetIdIsNotNull() {
            addCriterion("CABINET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetIdEqualTo(String value) {
            addCriterion("CABINET_ID =", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdNotEqualTo(String value) {
            addCriterion("CABINET_ID <>", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdGreaterThan(String value) {
            addCriterion("CABINET_ID >", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_ID >=", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdLessThan(String value) {
            addCriterion("CABINET_ID <", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdLessThanOrEqualTo(String value) {
            addCriterion("CABINET_ID <=", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdLike(String value) {
            addCriterion("CABINET_ID like", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdNotLike(String value) {
            addCriterion("CABINET_ID not like", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdIn(List<String> values) {
            addCriterion("CABINET_ID in", values, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdNotIn(List<String> values) {
            addCriterion("CABINET_ID not in", values, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdBetween(String value1, String value2) {
            addCriterion("CABINET_ID between", value1, value2, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdNotBetween(String value1, String value2) {
            addCriterion("CABINET_ID not between", value1, value2, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CARE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CARE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CARE_CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CARE_CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CARE_CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CARE_CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CARE_CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CARE_CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CARE_CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CARE_CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CARE_CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CARE_CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CARE_CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andWahoceIdIsNull() {
            addCriterion("WAHOCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andWahoceIdIsNotNull() {
            addCriterion("WAHOCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWahoceIdEqualTo(String value) {
            addCriterion("WAHOCE_ID =", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdNotEqualTo(String value) {
            addCriterion("WAHOCE_ID <>", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdGreaterThan(String value) {
            addCriterion("WAHOCE_ID >", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_ID >=", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdLessThan(String value) {
            addCriterion("WAHOCE_ID <", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_ID <=", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdLike(String value) {
            addCriterion("WAHOCE_ID like", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdNotLike(String value) {
            addCriterion("WAHOCE_ID not like", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdIn(List<String> values) {
            addCriterion("WAHOCE_ID in", values, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdNotIn(List<String> values) {
            addCriterion("WAHOCE_ID not in", values, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdBetween(String value1, String value2) {
            addCriterion("WAHOCE_ID between", value1, value2, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_ID not between", value1, value2, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIsNull() {
            addCriterion("CARE_QUERY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIsNotNull() {
            addCriterion("CARE_QUERY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andQueryTimeEqualTo(String value) {
            addCriterion("CARE_QUERY_TIME =", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotEqualTo(String value) {
            addCriterion("CARE_QUERY_TIME <>", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeGreaterThan(String value) {
            addCriterion("CARE_QUERY_TIME >", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_QUERY_TIME >=", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeLessThan(String value) {
            addCriterion("CARE_QUERY_TIME <", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeLessThanOrEqualTo(String value) {
            addCriterion("CARE_QUERY_TIME <=", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeLike(String value) {
            addCriterion("CARE_QUERY_TIME like", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotLike(String value) {
            addCriterion("CARE_QUERY_TIME not like", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIn(List<String> values) {
            addCriterion("CARE_QUERY_TIME in", values, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotIn(List<String> values) {
            addCriterion("CARE_QUERY_TIME not in", values, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeBetween(String value1, String value2) {
            addCriterion("CARE_QUERY_TIME between", value1, value2, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotBetween(String value1, String value2) {
            addCriterion("CARE_QUERY_TIME not between", value1, value2, "queryTime");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusIsNull() {
            addCriterion("CARE_CABINET_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusIsNotNull() {
            addCriterion("CARE_CABINET_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusEqualTo(String value) {
            addCriterion("CARE_CABINET_STATUS =", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusNotEqualTo(String value) {
            addCriterion("CARE_CABINET_STATUS <>", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusGreaterThan(String value) {
            addCriterion("CARE_CABINET_STATUS >", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_CABINET_STATUS >=", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusLessThan(String value) {
            addCriterion("CARE_CABINET_STATUS <", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusLessThanOrEqualTo(String value) {
            addCriterion("CARE_CABINET_STATUS <=", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusLike(String value) {
            addCriterion("CARE_CABINET_STATUS like", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusNotLike(String value) {
            addCriterion("CARE_CABINET_STATUS not like", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusIn(List<String> values) {
            addCriterion("CARE_CABINET_STATUS in", values, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusNotIn(List<String> values) {
            addCriterion("CARE_CABINET_STATUS not in", values, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusBetween(String value1, String value2) {
            addCriterion("CARE_CABINET_STATUS between", value1, value2, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusNotBetween(String value1, String value2) {
            addCriterion("CARE_CABINET_STATUS not between", value1, value2, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("CARE_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("CARE_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("CARE_OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("CARE_OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("CARE_OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("CARE_OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("CARE_OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("CARE_OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("CARE_OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("CARE_OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("CARE_OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("CARE_OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("CARE_OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNull() {
            addCriterion("CARE_RETURN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNotNull() {
            addCriterion("CARE_RETURN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeEqualTo(String value) {
            addCriterion("CARE_RETURN_TIME =", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotEqualTo(String value) {
            addCriterion("CARE_RETURN_TIME <>", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThan(String value) {
            addCriterion("CARE_RETURN_TIME >", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_RETURN_TIME >=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThan(String value) {
            addCriterion("CARE_RETURN_TIME <", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThanOrEqualTo(String value) {
            addCriterion("CARE_RETURN_TIME <=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLike(String value) {
            addCriterion("CARE_RETURN_TIME like", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotLike(String value) {
            addCriterion("CARE_RETURN_TIME not like", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIn(List<String> values) {
            addCriterion("CARE_RETURN_TIME in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotIn(List<String> values) {
            addCriterion("CARE_RETURN_TIME not in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeBetween(String value1, String value2) {
            addCriterion("CARE_RETURN_TIME between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotBetween(String value1, String value2) {
            addCriterion("CARE_RETURN_TIME not between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIsNull() {
            addCriterion("CARE_RETURN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIsNotNull() {
            addCriterion("CARE_RETURN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusEqualTo(String value) {
            addCriterion("CARE_RETURN_STATUS =", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotEqualTo(String value) {
            addCriterion("CARE_RETURN_STATUS <>", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusGreaterThan(String value) {
            addCriterion("CARE_RETURN_STATUS >", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_RETURN_STATUS >=", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLessThan(String value) {
            addCriterion("CARE_RETURN_STATUS <", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLessThanOrEqualTo(String value) {
            addCriterion("CARE_RETURN_STATUS <=", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLike(String value) {
            addCriterion("CARE_RETURN_STATUS like", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotLike(String value) {
            addCriterion("CARE_RETURN_STATUS not like", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIn(List<String> values) {
            addCriterion("CARE_RETURN_STATUS in", values, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotIn(List<String> values) {
            addCriterion("CARE_RETURN_STATUS not in", values, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusBetween(String value1, String value2) {
            addCriterion("CARE_RETURN_STATUS between", value1, value2, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotBetween(String value1, String value2) {
            addCriterion("CARE_RETURN_STATUS not between", value1, value2, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("CARE_OPEN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("CARE_OPEN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("CARE_OPEN_TIME =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("CARE_OPEN_TIME <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("CARE_OPEN_TIME >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_OPEN_TIME >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("CARE_OPEN_TIME <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("CARE_OPEN_TIME <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("CARE_OPEN_TIME like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("CARE_OPEN_TIME not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("CARE_OPEN_TIME in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("CARE_OPEN_TIME not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("CARE_OPEN_TIME between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("CARE_OPEN_TIME not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeIsNull() {
            addCriterion("CARE_CLOS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andClosTimeIsNotNull() {
            addCriterion("CARE_CLOS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andClosTimeEqualTo(String value) {
            addCriterion("CARE_CLOS_TIME =", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeNotEqualTo(String value) {
            addCriterion("CARE_CLOS_TIME <>", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeGreaterThan(String value) {
            addCriterion("CARE_CLOS_TIME >", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_CLOS_TIME >=", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeLessThan(String value) {
            addCriterion("CARE_CLOS_TIME <", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeLessThanOrEqualTo(String value) {
            addCriterion("CARE_CLOS_TIME <=", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeLike(String value) {
            addCriterion("CARE_CLOS_TIME like", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeNotLike(String value) {
            addCriterion("CARE_CLOS_TIME not like", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeIn(List<String> values) {
            addCriterion("CARE_CLOS_TIME in", values, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeNotIn(List<String> values) {
            addCriterion("CARE_CLOS_TIME not in", values, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeBetween(String value1, String value2) {
            addCriterion("CARE_CLOS_TIME between", value1, value2, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeNotBetween(String value1, String value2) {
            addCriterion("CARE_CLOS_TIME not between", value1, value2, "closTime");
            return (Criteria) this;
        }

        public Criteria andStateLockIsNull() {
            addCriterion("CARE_STATE_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andStateLockIsNotNull() {
            addCriterion("CARE_STATE_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andStateLockEqualTo(String value) {
            addCriterion("CARE_STATE_LOCK =", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockNotEqualTo(String value) {
            addCriterion("CARE_STATE_LOCK <>", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockGreaterThan(String value) {
            addCriterion("CARE_STATE_LOCK >", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_STATE_LOCK >=", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockLessThan(String value) {
            addCriterion("CARE_STATE_LOCK <", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockLessThanOrEqualTo(String value) {
            addCriterion("CARE_STATE_LOCK <=", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockLike(String value) {
            addCriterion("CARE_STATE_LOCK like", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockNotLike(String value) {
            addCriterion("CARE_STATE_LOCK not like", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockIn(List<String> values) {
            addCriterion("CARE_STATE_LOCK in", values, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockNotIn(List<String> values) {
            addCriterion("CARE_STATE_LOCK not in", values, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockBetween(String value1, String value2) {
            addCriterion("CARE_STATE_LOCK between", value1, value2, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockNotBetween(String value1, String value2) {
            addCriterion("CARE_STATE_LOCK not between", value1, value2, "stateLock");
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