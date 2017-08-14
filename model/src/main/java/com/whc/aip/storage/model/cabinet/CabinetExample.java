package com.whc.aip.storage.model.cabinet;

import com.whc.aip.storage.model.base.BaseDO;

import java.util.ArrayList;
import java.util.List;

public class CabinetExample extends BaseDO{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CabinetExample() {
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
            addCriterion("CABINET_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("CABINET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("CABINET_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("CABINET_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("CABINET_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("CABINET_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("CABINET_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("CABINET_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("CABINET_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("CABINET_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("CABINET_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("CABINET_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("CABINET_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("CABINET_NO is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("CABINET_NO is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("CABINET_NO =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("CABINET_NO <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("CABINET_NO >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_NO >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("CABINET_NO <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("CABINET_NO <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("CABINET_NO like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("CABINET_NO not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("CABINET_NO in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("CABINET_NO not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("CABINET_NO between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("CABINET_NO not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("CABINET_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("CABINET_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("CABINET_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("CABINET_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("CABINET_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("CABINET_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("CABINET_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("CABINET_STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("CABINET_STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("CABINET_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("CABINET_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("CABINET_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("CABINET_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("CABINET_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("CABINET_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("CABINET_ISDEL =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("CABINET_ISDEL <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("CABINET_ISDEL >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_ISDEL >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("CABINET_ISDEL <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("CABINET_ISDEL <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("CABINET_ISDEL like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("CABINET_ISDEL not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("CABINET_ISDEL in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("CABINET_ISDEL not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("CABINET_ISDEL between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
            addCriterion("CABINET_ISDEL not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("CABINET_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("CABINET_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("CABINET_PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("CABINET_PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("CABINET_PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("CABINET_PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("CABINET_PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("CABINET_PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("CABINET_PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("CABINET_PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("CABINET_PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("CABINET_PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("CABINET_PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andDoorNoIsNull() {
            addCriterion("CABINET_DOOR_NO is null");
            return (Criteria) this;
        }

        public Criteria andDoorNoIsNotNull() {
            addCriterion("CABINET_DOOR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDoorNoEqualTo(String value) {
            addCriterion("CABINET_DOOR_NO =", value, "doorNo");
            return (Criteria) this;
        }

        public Criteria andDoorNoNotEqualTo(String value) {
            addCriterion("CABINET_DOOR_NO <>", value, "doorNo");
            return (Criteria) this;
        }

        public Criteria andDoorNoGreaterThan(String value) {
            addCriterion("CABINET_DOOR_NO >", value, "doorNo");
            return (Criteria) this;
        }

        public Criteria andDoorNoGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_DOOR_NO >=", value, "doorNo");
            return (Criteria) this;
        }

        public Criteria andDoorNoLessThan(String value) {
            addCriterion("CABINET_DOOR_NO <", value, "doorNo");
            return (Criteria) this;
        }

        public Criteria andDoorNoLessThanOrEqualTo(String value) {
            addCriterion("CABINET_DOOR_NO <=", value, "doorNo");
            return (Criteria) this;
        }

        public Criteria andDoorNoLike(String value) {
            addCriterion("CABINET_DOOR_NO like", value, "doorNo");
            return (Criteria) this;
        }

        public Criteria andDoorNoNotLike(String value) {
            addCriterion("CABINET_DOOR_NO not like", value, "doorNo");
            return (Criteria) this;
        }

        public Criteria andDoorNoIn(List<String> values) {
            addCriterion("CABINET_DOOR_NO in", values, "doorNo");
            return (Criteria) this;
        }

        public Criteria andDoorNoNotIn(List<String> values) {
            addCriterion("CABINET_DOOR_NO not in", values, "doorNo");
            return (Criteria) this;
        }

        public Criteria andDoorNoBetween(String value1, String value2) {
            addCriterion("CABINET_DOOR_NO between", value1, value2, "doorNo");
            return (Criteria) this;
        }

        public Criteria andDoorNoNotBetween(String value1, String value2) {
            addCriterion("CABINET_DOOR_NO not between", value1, value2, "doorNo");
            return (Criteria) this;
        }

        public Criteria andWahoIdIsNull() {
            addCriterion("WAHO_ID is null");
            return (Criteria) this;
        }

        public Criteria andWahoIdIsNotNull() {
            addCriterion("WAHO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWahoIdEqualTo(String value) {
            addCriterion("WAHO_ID =", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdNotEqualTo(String value) {
            addCriterion("WAHO_ID <>", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdGreaterThan(String value) {
            addCriterion("WAHO_ID >", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_ID >=", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdLessThan(String value) {
            addCriterion("WAHO_ID <", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdLessThanOrEqualTo(String value) {
            addCriterion("WAHO_ID <=", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdLike(String value) {
            addCriterion("WAHO_ID like", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdNotLike(String value) {
            addCriterion("WAHO_ID not like", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdIn(List<String> values) {
            addCriterion("WAHO_ID in", values, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdNotIn(List<String> values) {
            addCriterion("WAHO_ID not in", values, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdBetween(String value1, String value2) {
            addCriterion("WAHO_ID between", value1, value2, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdNotBetween(String value1, String value2) {
            addCriterion("WAHO_ID not between", value1, value2, "wahoId");
            return (Criteria) this;
        }

        public Criteria andSupperPasswordIsNull() {
            addCriterion("CABINET_SUPPER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andSupperPasswordIsNotNull() {
            addCriterion("CABINET_SUPPER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andSupperPasswordEqualTo(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD =", value, "supperPassword");
            return (Criteria) this;
        }

        public Criteria andSupperPasswordNotEqualTo(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD <>", value, "supperPassword");
            return (Criteria) this;
        }

        public Criteria andSupperPasswordGreaterThan(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD >", value, "supperPassword");
            return (Criteria) this;
        }

        public Criteria andSupperPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD >=", value, "supperPassword");
            return (Criteria) this;
        }

        public Criteria andSupperPasswordLessThan(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD <", value, "supperPassword");
            return (Criteria) this;
        }

        public Criteria andSupperPasswordLessThanOrEqualTo(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD <=", value, "supperPassword");
            return (Criteria) this;
        }

        public Criteria andSupperPasswordLike(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD like", value, "supperPassword");
            return (Criteria) this;
        }

        public Criteria andSupperPasswordNotLike(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD not like", value, "supperPassword");
            return (Criteria) this;
        }

        public Criteria andSupperPasswordIn(List<String> values) {
            addCriterion("CABINET_SUPPER_PASSWORD in", values, "supperPassword");
            return (Criteria) this;
        }

        public Criteria andSupperPasswordNotIn(List<String> values) {
            addCriterion("CABINET_SUPPER_PASSWORD not in", values, "supperPassword");
            return (Criteria) this;
        }

        public Criteria andSupperPasswordBetween(String value1, String value2) {
            addCriterion("CABINET_SUPPER_PASSWORD between", value1, value2, "supperPassword");
            return (Criteria) this;
        }

        public Criteria andSupperPasswordNotBetween(String value1, String value2) {
            addCriterion("CABINET_SUPPER_PASSWORD not between", value1, value2, "supperPassword");
            return (Criteria) this;
        }

        public Criteria andCabiIdIsNull() {
            addCriterion("CABI_ID is null");
            return (Criteria) this;
        }

        public Criteria andCabiIdIsNotNull() {
            addCriterion("CABI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCabiIdEqualTo(String value) {
            addCriterion("CABI_ID =", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdNotEqualTo(String value) {
            addCriterion("CABI_ID <>", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdGreaterThan(String value) {
            addCriterion("CABI_ID >", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdGreaterThanOrEqualTo(String value) {
            addCriterion("CABI_ID >=", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdLessThan(String value) {
            addCriterion("CABI_ID <", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdLessThanOrEqualTo(String value) {
            addCriterion("CABI_ID <=", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdLike(String value) {
            addCriterion("CABI_ID like", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdNotLike(String value) {
            addCriterion("CABI_ID not like", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdIn(List<String> values) {
            addCriterion("CABI_ID in", values, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdNotIn(List<String> values) {
            addCriterion("CABI_ID not in", values, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdBetween(String value1, String value2) {
            addCriterion("CABI_ID between", value1, value2, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdNotBetween(String value1, String value2) {
            addCriterion("CABI_ID not between", value1, value2, "cabiId");
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

        public Criteria andOpenTimeIsNull() {
            addCriterion("CABINET_OPEN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("CABINET_OPEN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("CABINET_OPEN_TIME =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("CABINET_OPEN_TIME <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("CABINET_OPEN_TIME >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_OPEN_TIME >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("CABINET_OPEN_TIME <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("CABINET_OPEN_TIME <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("CABINET_OPEN_TIME like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("CABINET_OPEN_TIME not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("CABINET_OPEN_TIME in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("CABINET_OPEN_TIME not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("CABINET_OPEN_TIME between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("CABINET_OPEN_TIME not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeIsNull() {
            addCriterion("CABINET_CLOS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andClosTimeIsNotNull() {
            addCriterion("CABINET_CLOS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andClosTimeEqualTo(String value) {
            addCriterion("CABINET_CLOS_TIME =", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeNotEqualTo(String value) {
            addCriterion("CABINET_CLOS_TIME <>", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeGreaterThan(String value) {
            addCriterion("CABINET_CLOS_TIME >", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_CLOS_TIME >=", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeLessThan(String value) {
            addCriterion("CABINET_CLOS_TIME <", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeLessThanOrEqualTo(String value) {
            addCriterion("CABINET_CLOS_TIME <=", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeLike(String value) {
            addCriterion("CABINET_CLOS_TIME like", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeNotLike(String value) {
            addCriterion("CABINET_CLOS_TIME not like", value, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeIn(List<String> values) {
            addCriterion("CABINET_CLOS_TIME in", values, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeNotIn(List<String> values) {
            addCriterion("CABINET_CLOS_TIME not in", values, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeBetween(String value1, String value2) {
            addCriterion("CABINET_CLOS_TIME between", value1, value2, "closTime");
            return (Criteria) this;
        }

        public Criteria andClosTimeNotBetween(String value1, String value2) {
            addCriterion("CABINET_CLOS_TIME not between", value1, value2, "closTime");
            return (Criteria) this;
        }

        public Criteria andStateLockIsNull() {
            addCriterion("CABINET_STATE_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andStateLockIsNotNull() {
            addCriterion("CABINET_STATE_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andStateLockEqualTo(String value) {
            addCriterion("CABINET_STATE_LOCK =", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockNotEqualTo(String value) {
            addCriterion("CABINET_STATE_LOCK <>", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockGreaterThan(String value) {
            addCriterion("CABINET_STATE_LOCK >", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_STATE_LOCK >=", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockLessThan(String value) {
            addCriterion("CABINET_STATE_LOCK <", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockLessThanOrEqualTo(String value) {
            addCriterion("CABINET_STATE_LOCK <=", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockLike(String value) {
            addCriterion("CABINET_STATE_LOCK like", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockNotLike(String value) {
            addCriterion("CABINET_STATE_LOCK not like", value, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockIn(List<String> values) {
            addCriterion("CABINET_STATE_LOCK in", values, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockNotIn(List<String> values) {
            addCriterion("CABINET_STATE_LOCK not in", values, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockBetween(String value1, String value2) {
            addCriterion("CABINET_STATE_LOCK between", value1, value2, "stateLock");
            return (Criteria) this;
        }

        public Criteria andStateLockNotBetween(String value1, String value2) {
            addCriterion("CABINET_STATE_LOCK not between", value1, value2, "stateLock");
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