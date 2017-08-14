package com.whc.aip.storage.model.wahoce;

import java.util.ArrayList;
import java.util.List;

public class IntelligenceWahocePriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntelligenceWahocePriceExample() {
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
            addCriterion("INWAPR_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("INWAPR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("INWAPR_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("INWAPR_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("INWAPR_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("INWAPR_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("INWAPR_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("INWAPR_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("INWAPR_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("INWAPR_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("INWAPR_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("INWAPR_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("INWAPR_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("INWAPR_ID not between", value1, value2, "id");
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

        public Criteria andBeginTimeIsNull() {
            addCriterion("INWAPR_BEIGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("INWAPR_BEIGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(String value) {
            addCriterion("INWAPR_BEIGIN_TIME =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(String value) {
            addCriterion("INWAPR_BEIGIN_TIME <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(String value) {
            addCriterion("INWAPR_BEIGIN_TIME >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("INWAPR_BEIGIN_TIME >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(String value) {
            addCriterion("INWAPR_BEIGIN_TIME <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(String value) {
            addCriterion("INWAPR_BEIGIN_TIME <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLike(String value) {
            addCriterion("INWAPR_BEIGIN_TIME like", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotLike(String value) {
            addCriterion("INWAPR_BEIGIN_TIME not like", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<String> values) {
            addCriterion("INWAPR_BEIGIN_TIME in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<String> values) {
            addCriterion("INWAPR_BEIGIN_TIME not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(String value1, String value2) {
            addCriterion("INWAPR_BEIGIN_TIME between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(String value1, String value2) {
            addCriterion("INWAPR_BEIGIN_TIME not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("INWAPR_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("INWAPR_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("INWAPR_END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("INWAPR_END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("INWAPR_END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("INWAPR_END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("INWAPR_END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("INWAPR_END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("INWAPR_END_TIME like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("INWAPR_END_TIME not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("INWAPR_END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("INWAPR_END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("INWAPR_END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("INWAPR_END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("INWAPR_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("INWAPR_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("INWAPR_CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("INWAPR_CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("INWAPR_CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("INWAPR_CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("INWAPR_CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("INWAPR_CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("INWAPR_CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("INWAPR_CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("INWAPR_CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("INWAPR_CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("INWAPR_CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("INWAPR_CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andSize1PriceIsNull() {
            addCriterion("INWAPR_SIZE1_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSize1PriceIsNotNull() {
            addCriterion("INWAPR_SIZE1_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSize1PriceEqualTo(String value) {
            addCriterion("INWAPR_SIZE1_PRICE =", value, "size1Price");
            return (Criteria) this;
        }

        public Criteria andSize1PriceNotEqualTo(String value) {
            addCriterion("INWAPR_SIZE1_PRICE <>", value, "size1Price");
            return (Criteria) this;
        }

        public Criteria andSize1PriceGreaterThan(String value) {
            addCriterion("INWAPR_SIZE1_PRICE >", value, "size1Price");
            return (Criteria) this;
        }

        public Criteria andSize1PriceGreaterThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE1_PRICE >=", value, "size1Price");
            return (Criteria) this;
        }

        public Criteria andSize1PriceLessThan(String value) {
            addCriterion("INWAPR_SIZE1_PRICE <", value, "size1Price");
            return (Criteria) this;
        }

        public Criteria andSize1PriceLessThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE1_PRICE <=", value, "size1Price");
            return (Criteria) this;
        }

        public Criteria andSize1PriceLike(String value) {
            addCriterion("INWAPR_SIZE1_PRICE like", value, "size1Price");
            return (Criteria) this;
        }

        public Criteria andSize1PriceNotLike(String value) {
            addCriterion("INWAPR_SIZE1_PRICE not like", value, "size1Price");
            return (Criteria) this;
        }

        public Criteria andSize1PriceIn(List<String> values) {
            addCriterion("INWAPR_SIZE1_PRICE in", values, "size1Price");
            return (Criteria) this;
        }

        public Criteria andSize1PriceNotIn(List<String> values) {
            addCriterion("INWAPR_SIZE1_PRICE not in", values, "size1Price");
            return (Criteria) this;
        }

        public Criteria andSize1PriceBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE1_PRICE between", value1, value2, "size1Price");
            return (Criteria) this;
        }

        public Criteria andSize1PriceNotBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE1_PRICE not between", value1, value2, "size1Price");
            return (Criteria) this;
        }

        public Criteria andSize2PriceIsNull() {
            addCriterion("INWAPR_SIZE2_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSize2PriceIsNotNull() {
            addCriterion("INWAPR_SIZE2_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSize2PriceEqualTo(String value) {
            addCriterion("INWAPR_SIZE2_PRICE =", value, "size2Price");
            return (Criteria) this;
        }

        public Criteria andSize2PriceNotEqualTo(String value) {
            addCriterion("INWAPR_SIZE2_PRICE <>", value, "size2Price");
            return (Criteria) this;
        }

        public Criteria andSize2PriceGreaterThan(String value) {
            addCriterion("INWAPR_SIZE2_PRICE >", value, "size2Price");
            return (Criteria) this;
        }

        public Criteria andSize2PriceGreaterThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE2_PRICE >=", value, "size2Price");
            return (Criteria) this;
        }

        public Criteria andSize2PriceLessThan(String value) {
            addCriterion("INWAPR_SIZE2_PRICE <", value, "size2Price");
            return (Criteria) this;
        }

        public Criteria andSize2PriceLessThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE2_PRICE <=", value, "size2Price");
            return (Criteria) this;
        }

        public Criteria andSize2PriceLike(String value) {
            addCriterion("INWAPR_SIZE2_PRICE like", value, "size2Price");
            return (Criteria) this;
        }

        public Criteria andSize2PriceNotLike(String value) {
            addCriterion("INWAPR_SIZE2_PRICE not like", value, "size2Price");
            return (Criteria) this;
        }

        public Criteria andSize2PriceIn(List<String> values) {
            addCriterion("INWAPR_SIZE2_PRICE in", values, "size2Price");
            return (Criteria) this;
        }

        public Criteria andSize2PriceNotIn(List<String> values) {
            addCriterion("INWAPR_SIZE2_PRICE not in", values, "size2Price");
            return (Criteria) this;
        }

        public Criteria andSize2PriceBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE2_PRICE between", value1, value2, "size2Price");
            return (Criteria) this;
        }

        public Criteria andSize2PriceNotBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE2_PRICE not between", value1, value2, "size2Price");
            return (Criteria) this;
        }

        public Criteria andSize3PriceIsNull() {
            addCriterion("INWAPR_SIZE3_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSize3PriceIsNotNull() {
            addCriterion("INWAPR_SIZE3_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSize3PriceEqualTo(String value) {
            addCriterion("INWAPR_SIZE3_PRICE =", value, "size3Price");
            return (Criteria) this;
        }

        public Criteria andSize3PriceNotEqualTo(String value) {
            addCriterion("INWAPR_SIZE3_PRICE <>", value, "size3Price");
            return (Criteria) this;
        }

        public Criteria andSize3PriceGreaterThan(String value) {
            addCriterion("INWAPR_SIZE3_PRICE >", value, "size3Price");
            return (Criteria) this;
        }

        public Criteria andSize3PriceGreaterThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE3_PRICE >=", value, "size3Price");
            return (Criteria) this;
        }

        public Criteria andSize3PriceLessThan(String value) {
            addCriterion("INWAPR_SIZE3_PRICE <", value, "size3Price");
            return (Criteria) this;
        }

        public Criteria andSize3PriceLessThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE3_PRICE <=", value, "size3Price");
            return (Criteria) this;
        }

        public Criteria andSize3PriceLike(String value) {
            addCriterion("INWAPR_SIZE3_PRICE like", value, "size3Price");
            return (Criteria) this;
        }

        public Criteria andSize3PriceNotLike(String value) {
            addCriterion("INWAPR_SIZE3_PRICE not like", value, "size3Price");
            return (Criteria) this;
        }

        public Criteria andSize3PriceIn(List<String> values) {
            addCriterion("INWAPR_SIZE3_PRICE in", values, "size3Price");
            return (Criteria) this;
        }

        public Criteria andSize3PriceNotIn(List<String> values) {
            addCriterion("INWAPR_SIZE3_PRICE not in", values, "size3Price");
            return (Criteria) this;
        }

        public Criteria andSize3PriceBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE3_PRICE between", value1, value2, "size3Price");
            return (Criteria) this;
        }

        public Criteria andSize3PriceNotBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE3_PRICE not between", value1, value2, "size3Price");
            return (Criteria) this;
        }

        public Criteria andSize4PriceIsNull() {
            addCriterion("INWAPR_SIZE4_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSize4PriceIsNotNull() {
            addCriterion("INWAPR_SIZE4_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSize4PriceEqualTo(String value) {
            addCriterion("INWAPR_SIZE4_PRICE =", value, "size4Price");
            return (Criteria) this;
        }

        public Criteria andSize4PriceNotEqualTo(String value) {
            addCriterion("INWAPR_SIZE4_PRICE <>", value, "size4Price");
            return (Criteria) this;
        }

        public Criteria andSize4PriceGreaterThan(String value) {
            addCriterion("INWAPR_SIZE4_PRICE >", value, "size4Price");
            return (Criteria) this;
        }

        public Criteria andSize4PriceGreaterThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE4_PRICE >=", value, "size4Price");
            return (Criteria) this;
        }

        public Criteria andSize4PriceLessThan(String value) {
            addCriterion("INWAPR_SIZE4_PRICE <", value, "size4Price");
            return (Criteria) this;
        }

        public Criteria andSize4PriceLessThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE4_PRICE <=", value, "size4Price");
            return (Criteria) this;
        }

        public Criteria andSize4PriceLike(String value) {
            addCriterion("INWAPR_SIZE4_PRICE like", value, "size4Price");
            return (Criteria) this;
        }

        public Criteria andSize4PriceNotLike(String value) {
            addCriterion("INWAPR_SIZE4_PRICE not like", value, "size4Price");
            return (Criteria) this;
        }

        public Criteria andSize4PriceIn(List<String> values) {
            addCriterion("INWAPR_SIZE4_PRICE in", values, "size4Price");
            return (Criteria) this;
        }

        public Criteria andSize4PriceNotIn(List<String> values) {
            addCriterion("INWAPR_SIZE4_PRICE not in", values, "size4Price");
            return (Criteria) this;
        }

        public Criteria andSize4PriceBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE4_PRICE between", value1, value2, "size4Price");
            return (Criteria) this;
        }

        public Criteria andSize4PriceNotBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE4_PRICE not between", value1, value2, "size4Price");
            return (Criteria) this;
        }

        public Criteria andSize5PriceIsNull() {
            addCriterion("INWAPR_SIZE5_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSize5PriceIsNotNull() {
            addCriterion("INWAPR_SIZE5_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSize5PriceEqualTo(String value) {
            addCriterion("INWAPR_SIZE5_PRICE =", value, "size5Price");
            return (Criteria) this;
        }

        public Criteria andSize5PriceNotEqualTo(String value) {
            addCriterion("INWAPR_SIZE5_PRICE <>", value, "size5Price");
            return (Criteria) this;
        }

        public Criteria andSize5PriceGreaterThan(String value) {
            addCriterion("INWAPR_SIZE5_PRICE >", value, "size5Price");
            return (Criteria) this;
        }

        public Criteria andSize5PriceGreaterThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE5_PRICE >=", value, "size5Price");
            return (Criteria) this;
        }

        public Criteria andSize5PriceLessThan(String value) {
            addCriterion("INWAPR_SIZE5_PRICE <", value, "size5Price");
            return (Criteria) this;
        }

        public Criteria andSize5PriceLessThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE5_PRICE <=", value, "size5Price");
            return (Criteria) this;
        }

        public Criteria andSize5PriceLike(String value) {
            addCriterion("INWAPR_SIZE5_PRICE like", value, "size5Price");
            return (Criteria) this;
        }

        public Criteria andSize5PriceNotLike(String value) {
            addCriterion("INWAPR_SIZE5_PRICE not like", value, "size5Price");
            return (Criteria) this;
        }

        public Criteria andSize5PriceIn(List<String> values) {
            addCriterion("INWAPR_SIZE5_PRICE in", values, "size5Price");
            return (Criteria) this;
        }

        public Criteria andSize5PriceNotIn(List<String> values) {
            addCriterion("INWAPR_SIZE5_PRICE not in", values, "size5Price");
            return (Criteria) this;
        }

        public Criteria andSize5PriceBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE5_PRICE between", value1, value2, "size5Price");
            return (Criteria) this;
        }

        public Criteria andSize5PriceNotBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE5_PRICE not between", value1, value2, "size5Price");
            return (Criteria) this;
        }

        public Criteria andSize6PriceIsNull() {
            addCriterion("INWAPR_SIZE6_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSize6PriceIsNotNull() {
            addCriterion("INWAPR_SIZE6_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSize6PriceEqualTo(String value) {
            addCriterion("INWAPR_SIZE6_PRICE =", value, "size6Price");
            return (Criteria) this;
        }

        public Criteria andSize6PriceNotEqualTo(String value) {
            addCriterion("INWAPR_SIZE6_PRICE <>", value, "size6Price");
            return (Criteria) this;
        }

        public Criteria andSize6PriceGreaterThan(String value) {
            addCriterion("INWAPR_SIZE6_PRICE >", value, "size6Price");
            return (Criteria) this;
        }

        public Criteria andSize6PriceGreaterThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE6_PRICE >=", value, "size6Price");
            return (Criteria) this;
        }

        public Criteria andSize6PriceLessThan(String value) {
            addCriterion("INWAPR_SIZE6_PRICE <", value, "size6Price");
            return (Criteria) this;
        }

        public Criteria andSize6PriceLessThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE6_PRICE <=", value, "size6Price");
            return (Criteria) this;
        }

        public Criteria andSize6PriceLike(String value) {
            addCriterion("INWAPR_SIZE6_PRICE like", value, "size6Price");
            return (Criteria) this;
        }

        public Criteria andSize6PriceNotLike(String value) {
            addCriterion("INWAPR_SIZE6_PRICE not like", value, "size6Price");
            return (Criteria) this;
        }

        public Criteria andSize6PriceIn(List<String> values) {
            addCriterion("INWAPR_SIZE6_PRICE in", values, "size6Price");
            return (Criteria) this;
        }

        public Criteria andSize6PriceNotIn(List<String> values) {
            addCriterion("INWAPR_SIZE6_PRICE not in", values, "size6Price");
            return (Criteria) this;
        }

        public Criteria andSize6PriceBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE6_PRICE between", value1, value2, "size6Price");
            return (Criteria) this;
        }

        public Criteria andSize6PriceNotBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE6_PRICE not between", value1, value2, "size6Price");
            return (Criteria) this;
        }

        public Criteria andSize7PriceIsNull() {
            addCriterion("INWAPR_SIZE7_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSize7PriceIsNotNull() {
            addCriterion("INWAPR_SIZE7_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSize7PriceEqualTo(String value) {
            addCriterion("INWAPR_SIZE7_PRICE =", value, "size7Price");
            return (Criteria) this;
        }

        public Criteria andSize7PriceNotEqualTo(String value) {
            addCriterion("INWAPR_SIZE7_PRICE <>", value, "size7Price");
            return (Criteria) this;
        }

        public Criteria andSize7PriceGreaterThan(String value) {
            addCriterion("INWAPR_SIZE7_PRICE >", value, "size7Price");
            return (Criteria) this;
        }

        public Criteria andSize7PriceGreaterThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE7_PRICE >=", value, "size7Price");
            return (Criteria) this;
        }

        public Criteria andSize7PriceLessThan(String value) {
            addCriterion("INWAPR_SIZE7_PRICE <", value, "size7Price");
            return (Criteria) this;
        }

        public Criteria andSize7PriceLessThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE7_PRICE <=", value, "size7Price");
            return (Criteria) this;
        }

        public Criteria andSize7PriceLike(String value) {
            addCriterion("INWAPR_SIZE7_PRICE like", value, "size7Price");
            return (Criteria) this;
        }

        public Criteria andSize7PriceNotLike(String value) {
            addCriterion("INWAPR_SIZE7_PRICE not like", value, "size7Price");
            return (Criteria) this;
        }

        public Criteria andSize7PriceIn(List<String> values) {
            addCriterion("INWAPR_SIZE7_PRICE in", values, "size7Price");
            return (Criteria) this;
        }

        public Criteria andSize7PriceNotIn(List<String> values) {
            addCriterion("INWAPR_SIZE7_PRICE not in", values, "size7Price");
            return (Criteria) this;
        }

        public Criteria andSize7PriceBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE7_PRICE between", value1, value2, "size7Price");
            return (Criteria) this;
        }

        public Criteria andSize7PriceNotBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE7_PRICE not between", value1, value2, "size7Price");
            return (Criteria) this;
        }

        public Criteria andSize8PriceIsNull() {
            addCriterion("INWAPR_SIZE8_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSize8PriceIsNotNull() {
            addCriterion("INWAPR_SIZE8_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSize8PriceEqualTo(String value) {
            addCriterion("INWAPR_SIZE8_PRICE =", value, "size8Price");
            return (Criteria) this;
        }

        public Criteria andSize8PriceNotEqualTo(String value) {
            addCriterion("INWAPR_SIZE8_PRICE <>", value, "size8Price");
            return (Criteria) this;
        }

        public Criteria andSize8PriceGreaterThan(String value) {
            addCriterion("INWAPR_SIZE8_PRICE >", value, "size8Price");
            return (Criteria) this;
        }

        public Criteria andSize8PriceGreaterThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE8_PRICE >=", value, "size8Price");
            return (Criteria) this;
        }

        public Criteria andSize8PriceLessThan(String value) {
            addCriterion("INWAPR_SIZE8_PRICE <", value, "size8Price");
            return (Criteria) this;
        }

        public Criteria andSize8PriceLessThanOrEqualTo(String value) {
            addCriterion("INWAPR_SIZE8_PRICE <=", value, "size8Price");
            return (Criteria) this;
        }

        public Criteria andSize8PriceLike(String value) {
            addCriterion("INWAPR_SIZE8_PRICE like", value, "size8Price");
            return (Criteria) this;
        }

        public Criteria andSize8PriceNotLike(String value) {
            addCriterion("INWAPR_SIZE8_PRICE not like", value, "size8Price");
            return (Criteria) this;
        }

        public Criteria andSize8PriceIn(List<String> values) {
            addCriterion("INWAPR_SIZE8_PRICE in", values, "size8Price");
            return (Criteria) this;
        }

        public Criteria andSize8PriceNotIn(List<String> values) {
            addCriterion("INWAPR_SIZE8_PRICE not in", values, "size8Price");
            return (Criteria) this;
        }

        public Criteria andSize8PriceBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE8_PRICE between", value1, value2, "size8Price");
            return (Criteria) this;
        }

        public Criteria andSize8PriceNotBetween(String value1, String value2) {
            addCriterion("INWAPR_SIZE8_PRICE not between", value1, value2, "size8Price");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("INWAPR_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("INWAPR_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("INWAPR_ISDEL =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("INWAPR_ISDEL <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("INWAPR_ISDEL >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("INWAPR_ISDEL >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("INWAPR_ISDEL <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("INWAPR_ISDEL <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("INWAPR_ISDEL like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("INWAPR_ISDEL not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("INWAPR_ISDEL in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("INWAPR_ISDEL not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("INWAPR_ISDEL between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
            addCriterion("INWAPR_ISDEL not between", value1, value2, "isDel");
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