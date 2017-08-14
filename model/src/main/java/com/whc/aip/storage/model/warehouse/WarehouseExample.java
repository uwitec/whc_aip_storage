package com.whc.aip.storage.model.warehouse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseExample() {
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
            addCriterion("WAHO_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("WAHO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("WAHO_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("WAHO_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("WAHO_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("WAHO_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("WAHO_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("WAHO_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("WAHO_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("WAHO_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("WAHO_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("WAHO_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("WAHO_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("WAHO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("WAHO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("WAHO_NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("WAHO_NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("WAHO_NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("WAHO_NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("WAHO_NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("WAHO_NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("WAHO_NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("WAHO_NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("WAHO_NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("WAHO_NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("WAHO_NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("WAHO_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("WAHO_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("WAHO_PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("WAHO_PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("WAHO_PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("WAHO_PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("WAHO_PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("WAHO_PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("WAHO_PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("WAHO_PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("WAHO_PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("WAHO_PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("WAHO_PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("WAHO_CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("WAHO_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("WAHO_CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("WAHO_CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("WAHO_CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("WAHO_CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("WAHO_CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("WAHO_CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("WAHO_CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("WAHO_CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("WAHO_CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("WAHO_CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("WAHO_CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("WAHO_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("WAHO_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("WAHO_ADDR =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("WAHO_ADDR <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("WAHO_ADDR >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_ADDR >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("WAHO_ADDR <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("WAHO_ADDR <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("WAHO_ADDR like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("WAHO_ADDR not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("WAHO_ADDR in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("WAHO_ADDR not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("WAHO_ADDR between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("WAHO_ADDR not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("WAHO_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("WAHO_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("WAHO_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("WAHO_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("WAHO_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("WAHO_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("WAHO_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("WAHO_STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("WAHO_STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("WAHO_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("WAHO_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("WAHO_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("WAHO_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("WAHO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("WAHO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("WAHO_TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("WAHO_TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("WAHO_TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("WAHO_TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("WAHO_TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("WAHO_TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("WAHO_TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("WAHO_TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("WAHO_TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("WAHO_TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("WAHO_TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("WAHO_AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("WAHO_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("WAHO_AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("WAHO_AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("WAHO_AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("WAHO_AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("WAHO_AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("WAHO_AREA like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("WAHO_AREA not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("WAHO_AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("WAHO_AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("WAHO_AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("WAHO_AREA not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andImage1IsNull() {
            addCriterion("WAHO_IMAGE1 is null");
            return (Criteria) this;
        }

        public Criteria andImage1IsNotNull() {
            addCriterion("WAHO_IMAGE1 is not null");
            return (Criteria) this;
        }

        public Criteria andImage1EqualTo(String value) {
            addCriterion("WAHO_IMAGE1 =", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotEqualTo(String value) {
            addCriterion("WAHO_IMAGE1 <>", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1GreaterThan(String value) {
            addCriterion("WAHO_IMAGE1 >", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1GreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGE1 >=", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1LessThan(String value) {
            addCriterion("WAHO_IMAGE1 <", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1LessThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGE1 <=", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1Like(String value) {
            addCriterion("WAHO_IMAGE1 like", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotLike(String value) {
            addCriterion("WAHO_IMAGE1 not like", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1In(List<String> values) {
            addCriterion("WAHO_IMAGE1 in", values, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotIn(List<String> values) {
            addCriterion("WAHO_IMAGE1 not in", values, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1Between(String value1, String value2) {
            addCriterion("WAHO_IMAGE1 between", value1, value2, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotBetween(String value1, String value2) {
            addCriterion("WAHO_IMAGE1 not between", value1, value2, "image1");
            return (Criteria) this;
        }

        public Criteria andImage2IsNull() {
            addCriterion("WAHO_IMAGE2 is null");
            return (Criteria) this;
        }

        public Criteria andImage2IsNotNull() {
            addCriterion("WAHO_IMAGE2 is not null");
            return (Criteria) this;
        }

        public Criteria andImage2EqualTo(String value) {
            addCriterion("WAHO_IMAGE2 =", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotEqualTo(String value) {
            addCriterion("WAHO_IMAGE2 <>", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2GreaterThan(String value) {
            addCriterion("WAHO_IMAGE2 >", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2GreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGE2 >=", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2LessThan(String value) {
            addCriterion("WAHO_IMAGE2 <", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2LessThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGE2 <=", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2Like(String value) {
            addCriterion("WAHO_IMAGE2 like", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotLike(String value) {
            addCriterion("WAHO_IMAGE2 not like", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2In(List<String> values) {
            addCriterion("WAHO_IMAGE2 in", values, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotIn(List<String> values) {
            addCriterion("WAHO_IMAGE2 not in", values, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2Between(String value1, String value2) {
            addCriterion("WAHO_IMAGE2 between", value1, value2, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotBetween(String value1, String value2) {
            addCriterion("WAHO_IMAGE2 not between", value1, value2, "image2");
            return (Criteria) this;
        }

        public Criteria andImage3IsNull() {
            addCriterion("WAHO_IMAGE3 is null");
            return (Criteria) this;
        }

        public Criteria andImage3IsNotNull() {
            addCriterion("WAHO_IMAGE3 is not null");
            return (Criteria) this;
        }

        public Criteria andImage3EqualTo(String value) {
            addCriterion("WAHO_IMAGE3 =", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotEqualTo(String value) {
            addCriterion("WAHO_IMAGE3 <>", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3GreaterThan(String value) {
            addCriterion("WAHO_IMAGE3 >", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3GreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGE3 >=", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3LessThan(String value) {
            addCriterion("WAHO_IMAGE3 <", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3LessThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGE3 <=", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3Like(String value) {
            addCriterion("WAHO_IMAGE3 like", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotLike(String value) {
            addCriterion("WAHO_IMAGE3 not like", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3In(List<String> values) {
            addCriterion("WAHO_IMAGE3 in", values, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotIn(List<String> values) {
            addCriterion("WAHO_IMAGE3 not in", values, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3Between(String value1, String value2) {
            addCriterion("WAHO_IMAGE3 between", value1, value2, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotBetween(String value1, String value2) {
            addCriterion("WAHO_IMAGE3 not between", value1, value2, "image3");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("WAHO_INTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("WAHO_INTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("WAHO_INTRODUCE =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("WAHO_INTRODUCE <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("WAHO_INTRODUCE >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_INTRODUCE >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("WAHO_INTRODUCE <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("WAHO_INTRODUCE <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("WAHO_INTRODUCE like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("WAHO_INTRODUCE not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("WAHO_INTRODUCE in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("WAHO_INTRODUCE not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("WAHO_INTRODUCE between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("WAHO_INTRODUCE not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andPersIdIsNull() {
            addCriterion("WAHO_PERS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPersIdIsNotNull() {
            addCriterion("WAHO_PERS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPersIdEqualTo(String value) {
            addCriterion("WAHO_PERS_ID =", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotEqualTo(String value) {
            addCriterion("WAHO_PERS_ID <>", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdGreaterThan(String value) {
            addCriterion("WAHO_PERS_ID >", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_PERS_ID >=", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdLessThan(String value) {
            addCriterion("WAHO_PERS_ID <", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdLessThanOrEqualTo(String value) {
            addCriterion("WAHO_PERS_ID <=", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdLike(String value) {
            addCriterion("WAHO_PERS_ID like", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotLike(String value) {
            addCriterion("WAHO_PERS_ID not like", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdIn(List<String> values) {
            addCriterion("WAHO_PERS_ID in", values, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotIn(List<String> values) {
            addCriterion("WAHO_PERS_ID not in", values, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdBetween(String value1, String value2) {
            addCriterion("WAHO_PERS_ID between", value1, value2, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotBetween(String value1, String value2) {
            addCriterion("WAHO_PERS_ID not between", value1, value2, "persId");
            return (Criteria) this;
        }

        public Criteria andPreferentialIsNull() {
            addCriterion("WAHO_PREFERENTIAL is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialIsNotNull() {
            addCriterion("WAHO_PREFERENTIAL is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialEqualTo(String value) {
            addCriterion("WAHO_PREFERENTIAL =", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialNotEqualTo(String value) {
            addCriterion("WAHO_PREFERENTIAL <>", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialGreaterThan(String value) {
            addCriterion("WAHO_PREFERENTIAL >", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_PREFERENTIAL >=", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialLessThan(String value) {
            addCriterion("WAHO_PREFERENTIAL <", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialLessThanOrEqualTo(String value) {
            addCriterion("WAHO_PREFERENTIAL <=", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialLike(String value) {
            addCriterion("WAHO_PREFERENTIAL like", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialNotLike(String value) {
            addCriterion("WAHO_PREFERENTIAL not like", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialIn(List<String> values) {
            addCriterion("WAHO_PREFERENTIAL in", values, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialNotIn(List<String> values) {
            addCriterion("WAHO_PREFERENTIAL not in", values, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialBetween(String value1, String value2) {
            addCriterion("WAHO_PREFERENTIAL between", value1, value2, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialNotBetween(String value1, String value2) {
            addCriterion("WAHO_PREFERENTIAL not between", value1, value2, "preferential");
            return (Criteria) this;
        }

        public Criteria andLongiIsNull() {
            addCriterion("WAHO_LONG is null");
            return (Criteria) this;
        }

        public Criteria andLongiIsNotNull() {
            addCriterion("WAHO_LONG is not null");
            return (Criteria) this;
        }

        public Criteria andLongiEqualTo(BigDecimal value) {
            addCriterion("WAHO_LONG =", value, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiNotEqualTo(BigDecimal value) {
            addCriterion("WAHO_LONG <>", value, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiGreaterThan(BigDecimal value) {
            addCriterion("WAHO_LONG >", value, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WAHO_LONG >=", value, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiLessThan(BigDecimal value) {
            addCriterion("WAHO_LONG <", value, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WAHO_LONG <=", value, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiIn(List<BigDecimal> values) {
            addCriterion("WAHO_LONG in", values, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiNotIn(List<BigDecimal> values) {
            addCriterion("WAHO_LONG not in", values, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAHO_LONG between", value1, value2, "longi");
            return (Criteria) this;
        }

        public Criteria andLongiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAHO_LONG not between", value1, value2, "longi");
            return (Criteria) this;
        }

        public Criteria andLatiIsNull() {
            addCriterion("WAHO_LATI is null");
            return (Criteria) this;
        }

        public Criteria andLatiIsNotNull() {
            addCriterion("WAHO_LATI is not null");
            return (Criteria) this;
        }

        public Criteria andLatiEqualTo(BigDecimal value) {
            addCriterion("WAHO_LATI =", value, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiNotEqualTo(BigDecimal value) {
            addCriterion("WAHO_LATI <>", value, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiGreaterThan(BigDecimal value) {
            addCriterion("WAHO_LATI >", value, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WAHO_LATI >=", value, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiLessThan(BigDecimal value) {
            addCriterion("WAHO_LATI <", value, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WAHO_LATI <=", value, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiIn(List<BigDecimal> values) {
            addCriterion("WAHO_LATI in", values, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiNotIn(List<BigDecimal> values) {
            addCriterion("WAHO_LATI not in", values, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAHO_LATI between", value1, value2, "lati");
            return (Criteria) this;
        }

        public Criteria andLatiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAHO_LATI not between", value1, value2, "lati");
            return (Criteria) this;
        }

        public Criteria andBriaddrIsNull() {
            addCriterion("WAHO_BRIADDR is null");
            return (Criteria) this;
        }

        public Criteria andBriaddrIsNotNull() {
            addCriterion("WAHO_BRIADDR is not null");
            return (Criteria) this;
        }

        public Criteria andBriaddrEqualTo(String value) {
            addCriterion("WAHO_BRIADDR =", value, "briaddr");
            return (Criteria) this;
        }

        public Criteria andBriaddrNotEqualTo(String value) {
            addCriterion("WAHO_BRIADDR <>", value, "briaddr");
            return (Criteria) this;
        }

        public Criteria andBriaddrGreaterThan(String value) {
            addCriterion("WAHO_BRIADDR >", value, "briaddr");
            return (Criteria) this;
        }

        public Criteria andBriaddrGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_BRIADDR >=", value, "briaddr");
            return (Criteria) this;
        }

        public Criteria andBriaddrLessThan(String value) {
            addCriterion("WAHO_BRIADDR <", value, "briaddr");
            return (Criteria) this;
        }

        public Criteria andBriaddrLessThanOrEqualTo(String value) {
            addCriterion("WAHO_BRIADDR <=", value, "briaddr");
            return (Criteria) this;
        }

        public Criteria andBriaddrLike(String value) {
            addCriterion("WAHO_BRIADDR like", value, "briaddr");
            return (Criteria) this;
        }

        public Criteria andBriaddrNotLike(String value) {
            addCriterion("WAHO_BRIADDR not like", value, "briaddr");
            return (Criteria) this;
        }

        public Criteria andBriaddrIn(List<String> values) {
            addCriterion("WAHO_BRIADDR in", values, "briaddr");
            return (Criteria) this;
        }

        public Criteria andBriaddrNotIn(List<String> values) {
            addCriterion("WAHO_BRIADDR not in", values, "briaddr");
            return (Criteria) this;
        }

        public Criteria andBriaddrBetween(String value1, String value2) {
            addCriterion("WAHO_BRIADDR between", value1, value2, "briaddr");
            return (Criteria) this;
        }

        public Criteria andBriaddrNotBetween(String value1, String value2) {
            addCriterion("WAHO_BRIADDR not between", value1, value2, "briaddr");
            return (Criteria) this;
        }

        public Criteria andDisLevel1IsNull() {
            addCriterion("WAHO_DIS_LEVEL1 is null");
            return (Criteria) this;
        }

        public Criteria andDisLevel1IsNotNull() {
            addCriterion("WAHO_DIS_LEVEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andDisLevel1EqualTo(String value) {
            addCriterion("WAHO_DIS_LEVEL1 =", value, "disLevel1");
            return (Criteria) this;
        }

        public Criteria andDisLevel1NotEqualTo(String value) {
            addCriterion("WAHO_DIS_LEVEL1 <>", value, "disLevel1");
            return (Criteria) this;
        }

        public Criteria andDisLevel1GreaterThan(String value) {
            addCriterion("WAHO_DIS_LEVEL1 >", value, "disLevel1");
            return (Criteria) this;
        }

        public Criteria andDisLevel1GreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_DIS_LEVEL1 >=", value, "disLevel1");
            return (Criteria) this;
        }

        public Criteria andDisLevel1LessThan(String value) {
            addCriterion("WAHO_DIS_LEVEL1 <", value, "disLevel1");
            return (Criteria) this;
        }

        public Criteria andDisLevel1LessThanOrEqualTo(String value) {
            addCriterion("WAHO_DIS_LEVEL1 <=", value, "disLevel1");
            return (Criteria) this;
        }

        public Criteria andDisLevel1Like(String value) {
            addCriterion("WAHO_DIS_LEVEL1 like", value, "disLevel1");
            return (Criteria) this;
        }

        public Criteria andDisLevel1NotLike(String value) {
            addCriterion("WAHO_DIS_LEVEL1 not like", value, "disLevel1");
            return (Criteria) this;
        }

        public Criteria andDisLevel1In(List<String> values) {
            addCriterion("WAHO_DIS_LEVEL1 in", values, "disLevel1");
            return (Criteria) this;
        }

        public Criteria andDisLevel1NotIn(List<String> values) {
            addCriterion("WAHO_DIS_LEVEL1 not in", values, "disLevel1");
            return (Criteria) this;
        }

        public Criteria andDisLevel1Between(String value1, String value2) {
            addCriterion("WAHO_DIS_LEVEL1 between", value1, value2, "disLevel1");
            return (Criteria) this;
        }

        public Criteria andDisLevel1NotBetween(String value1, String value2) {
            addCriterion("WAHO_DIS_LEVEL1 not between", value1, value2, "disLevel1");
            return (Criteria) this;
        }

        public Criteria andDisLevel2IsNull() {
            addCriterion("WAHO_DIS_LEVEL2 is null");
            return (Criteria) this;
        }

        public Criteria andDisLevel2IsNotNull() {
            addCriterion("WAHO_DIS_LEVEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andDisLevel2EqualTo(String value) {
            addCriterion("WAHO_DIS_LEVEL2 =", value, "disLevel2");
            return (Criteria) this;
        }

        public Criteria andDisLevel2NotEqualTo(String value) {
            addCriterion("WAHO_DIS_LEVEL2 <>", value, "disLevel2");
            return (Criteria) this;
        }

        public Criteria andDisLevel2GreaterThan(String value) {
            addCriterion("WAHO_DIS_LEVEL2 >", value, "disLevel2");
            return (Criteria) this;
        }

        public Criteria andDisLevel2GreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_DIS_LEVEL2 >=", value, "disLevel2");
            return (Criteria) this;
        }

        public Criteria andDisLevel2LessThan(String value) {
            addCriterion("WAHO_DIS_LEVEL2 <", value, "disLevel2");
            return (Criteria) this;
        }

        public Criteria andDisLevel2LessThanOrEqualTo(String value) {
            addCriterion("WAHO_DIS_LEVEL2 <=", value, "disLevel2");
            return (Criteria) this;
        }

        public Criteria andDisLevel2Like(String value) {
            addCriterion("WAHO_DIS_LEVEL2 like", value, "disLevel2");
            return (Criteria) this;
        }

        public Criteria andDisLevel2NotLike(String value) {
            addCriterion("WAHO_DIS_LEVEL2 not like", value, "disLevel2");
            return (Criteria) this;
        }

        public Criteria andDisLevel2In(List<String> values) {
            addCriterion("WAHO_DIS_LEVEL2 in", values, "disLevel2");
            return (Criteria) this;
        }

        public Criteria andDisLevel2NotIn(List<String> values) {
            addCriterion("WAHO_DIS_LEVEL2 not in", values, "disLevel2");
            return (Criteria) this;
        }

        public Criteria andDisLevel2Between(String value1, String value2) {
            addCriterion("WAHO_DIS_LEVEL2 between", value1, value2, "disLevel2");
            return (Criteria) this;
        }

        public Criteria andDisLevel2NotBetween(String value1, String value2) {
            addCriterion("WAHO_DIS_LEVEL2 not between", value1, value2, "disLevel2");
            return (Criteria) this;
        }

        public Criteria andDisLevel3IsNull() {
            addCriterion("WAHO_DIS_LEVEL3 is null");
            return (Criteria) this;
        }

        public Criteria andDisLevel3IsNotNull() {
            addCriterion("WAHO_DIS_LEVEL3 is not null");
            return (Criteria) this;
        }

        public Criteria andDisLevel3EqualTo(String value) {
            addCriterion("WAHO_DIS_LEVEL3 =", value, "disLevel3");
            return (Criteria) this;
        }

        public Criteria andDisLevel3NotEqualTo(String value) {
            addCriterion("WAHO_DIS_LEVEL3 <>", value, "disLevel3");
            return (Criteria) this;
        }

        public Criteria andDisLevel3GreaterThan(String value) {
            addCriterion("WAHO_DIS_LEVEL3 >", value, "disLevel3");
            return (Criteria) this;
        }

        public Criteria andDisLevel3GreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_DIS_LEVEL3 >=", value, "disLevel3");
            return (Criteria) this;
        }

        public Criteria andDisLevel3LessThan(String value) {
            addCriterion("WAHO_DIS_LEVEL3 <", value, "disLevel3");
            return (Criteria) this;
        }

        public Criteria andDisLevel3LessThanOrEqualTo(String value) {
            addCriterion("WAHO_DIS_LEVEL3 <=", value, "disLevel3");
            return (Criteria) this;
        }

        public Criteria andDisLevel3Like(String value) {
            addCriterion("WAHO_DIS_LEVEL3 like", value, "disLevel3");
            return (Criteria) this;
        }

        public Criteria andDisLevel3NotLike(String value) {
            addCriterion("WAHO_DIS_LEVEL3 not like", value, "disLevel3");
            return (Criteria) this;
        }

        public Criteria andDisLevel3In(List<String> values) {
            addCriterion("WAHO_DIS_LEVEL3 in", values, "disLevel3");
            return (Criteria) this;
        }

        public Criteria andDisLevel3NotIn(List<String> values) {
            addCriterion("WAHO_DIS_LEVEL3 not in", values, "disLevel3");
            return (Criteria) this;
        }

        public Criteria andDisLevel3Between(String value1, String value2) {
            addCriterion("WAHO_DIS_LEVEL3 between", value1, value2, "disLevel3");
            return (Criteria) this;
        }

        public Criteria andDisLevel3NotBetween(String value1, String value2) {
            addCriterion("WAHO_DIS_LEVEL3 not between", value1, value2, "disLevel3");
            return (Criteria) this;
        }

        public Criteria andImage4IsNull() {
            addCriterion("WAHO_IMAGE4 is null");
            return (Criteria) this;
        }

        public Criteria andImage4IsNotNull() {
            addCriterion("WAHO_IMAGE4 is not null");
            return (Criteria) this;
        }

        public Criteria andImage4EqualTo(String value) {
            addCriterion("WAHO_IMAGE4 =", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4NotEqualTo(String value) {
            addCriterion("WAHO_IMAGE4 <>", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4GreaterThan(String value) {
            addCriterion("WAHO_IMAGE4 >", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4GreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGE4 >=", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4LessThan(String value) {
            addCriterion("WAHO_IMAGE4 <", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4LessThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGE4 <=", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4Like(String value) {
            addCriterion("WAHO_IMAGE4 like", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4NotLike(String value) {
            addCriterion("WAHO_IMAGE4 not like", value, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4In(List<String> values) {
            addCriterion("WAHO_IMAGE4 in", values, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4NotIn(List<String> values) {
            addCriterion("WAHO_IMAGE4 not in", values, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4Between(String value1, String value2) {
            addCriterion("WAHO_IMAGE4 between", value1, value2, "image4");
            return (Criteria) this;
        }

        public Criteria andImage4NotBetween(String value1, String value2) {
            addCriterion("WAHO_IMAGE4 not between", value1, value2, "image4");
            return (Criteria) this;
        }

        public Criteria andImage5IsNull() {
            addCriterion("WAHO_IMAGE5 is null");
            return (Criteria) this;
        }

        public Criteria andImage5IsNotNull() {
            addCriterion("WAHO_IMAGE5 is not null");
            return (Criteria) this;
        }

        public Criteria andImage5EqualTo(String value) {
            addCriterion("WAHO_IMAGE5 =", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5NotEqualTo(String value) {
            addCriterion("WAHO_IMAGE5 <>", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5GreaterThan(String value) {
            addCriterion("WAHO_IMAGE5 >", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5GreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGE5 >=", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5LessThan(String value) {
            addCriterion("WAHO_IMAGE5 <", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5LessThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGE5 <=", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5Like(String value) {
            addCriterion("WAHO_IMAGE5 like", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5NotLike(String value) {
            addCriterion("WAHO_IMAGE5 not like", value, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5In(List<String> values) {
            addCriterion("WAHO_IMAGE5 in", values, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5NotIn(List<String> values) {
            addCriterion("WAHO_IMAGE5 not in", values, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5Between(String value1, String value2) {
            addCriterion("WAHO_IMAGE5 between", value1, value2, "image5");
            return (Criteria) this;
        }

        public Criteria andImage5NotBetween(String value1, String value2) {
            addCriterion("WAHO_IMAGE5 not between", value1, value2, "image5");
            return (Criteria) this;
        }

        public Criteria andImage6IsNull() {
            addCriterion("WAHO_IMAGE6 is null");
            return (Criteria) this;
        }

        public Criteria andImage6IsNotNull() {
            addCriterion("WAHO_IMAGE6 is not null");
            return (Criteria) this;
        }

        public Criteria andImage6EqualTo(String value) {
            addCriterion("WAHO_IMAGE6 =", value, "image6");
            return (Criteria) this;
        }

        public Criteria andImage6NotEqualTo(String value) {
            addCriterion("WAHO_IMAGE6 <>", value, "image6");
            return (Criteria) this;
        }

        public Criteria andImage6GreaterThan(String value) {
            addCriterion("WAHO_IMAGE6 >", value, "image6");
            return (Criteria) this;
        }

        public Criteria andImage6GreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGE6 >=", value, "image6");
            return (Criteria) this;
        }

        public Criteria andImage6LessThan(String value) {
            addCriterion("WAHO_IMAGE6 <", value, "image6");
            return (Criteria) this;
        }

        public Criteria andImage6LessThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGE6 <=", value, "image6");
            return (Criteria) this;
        }

        public Criteria andImage6Like(String value) {
            addCriterion("WAHO_IMAGE6 like", value, "image6");
            return (Criteria) this;
        }

        public Criteria andImage6NotLike(String value) {
            addCriterion("WAHO_IMAGE6 not like", value, "image6");
            return (Criteria) this;
        }

        public Criteria andImage6In(List<String> values) {
            addCriterion("WAHO_IMAGE6 in", values, "image6");
            return (Criteria) this;
        }

        public Criteria andImage6NotIn(List<String> values) {
            addCriterion("WAHO_IMAGE6 not in", values, "image6");
            return (Criteria) this;
        }

        public Criteria andImage6Between(String value1, String value2) {
            addCriterion("WAHO_IMAGE6 between", value1, value2, "image6");
            return (Criteria) this;
        }

        public Criteria andImage6NotBetween(String value1, String value2) {
            addCriterion("WAHO_IMAGE6 not between", value1, value2, "image6");
            return (Criteria) this;
        }

        public Criteria andImage7IsNull() {
            addCriterion("WAHO_IMAGE7 is null");
            return (Criteria) this;
        }

        public Criteria andImage7IsNotNull() {
            addCriterion("WAHO_IMAGE7 is not null");
            return (Criteria) this;
        }

        public Criteria andImage7EqualTo(String value) {
            addCriterion("WAHO_IMAGE7 =", value, "image7");
            return (Criteria) this;
        }

        public Criteria andImage7NotEqualTo(String value) {
            addCriterion("WAHO_IMAGE7 <>", value, "image7");
            return (Criteria) this;
        }

        public Criteria andImage7GreaterThan(String value) {
            addCriterion("WAHO_IMAGE7 >", value, "image7");
            return (Criteria) this;
        }

        public Criteria andImage7GreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGE7 >=", value, "image7");
            return (Criteria) this;
        }

        public Criteria andImage7LessThan(String value) {
            addCriterion("WAHO_IMAGE7 <", value, "image7");
            return (Criteria) this;
        }

        public Criteria andImage7LessThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGE7 <=", value, "image7");
            return (Criteria) this;
        }

        public Criteria andImage7Like(String value) {
            addCriterion("WAHO_IMAGE7 like", value, "image7");
            return (Criteria) this;
        }

        public Criteria andImage7NotLike(String value) {
            addCriterion("WAHO_IMAGE7 not like", value, "image7");
            return (Criteria) this;
        }

        public Criteria andImage7In(List<String> values) {
            addCriterion("WAHO_IMAGE7 in", values, "image7");
            return (Criteria) this;
        }

        public Criteria andImage7NotIn(List<String> values) {
            addCriterion("WAHO_IMAGE7 not in", values, "image7");
            return (Criteria) this;
        }

        public Criteria andImage7Between(String value1, String value2) {
            addCriterion("WAHO_IMAGE7 between", value1, value2, "image7");
            return (Criteria) this;
        }

        public Criteria andImage7NotBetween(String value1, String value2) {
            addCriterion("WAHO_IMAGE7 not between", value1, value2, "image7");
            return (Criteria) this;
        }

        public Criteria andAdv1IsNull() {
            addCriterion("WAHO_ADV1 is null");
            return (Criteria) this;
        }

        public Criteria andAdv1IsNotNull() {
            addCriterion("WAHO_ADV1 is not null");
            return (Criteria) this;
        }

        public Criteria andAdv1EqualTo(String value) {
            addCriterion("WAHO_ADV1 =", value, "adv1");
            return (Criteria) this;
        }

        public Criteria andAdv1NotEqualTo(String value) {
            addCriterion("WAHO_ADV1 <>", value, "adv1");
            return (Criteria) this;
        }

        public Criteria andAdv1GreaterThan(String value) {
            addCriterion("WAHO_ADV1 >", value, "adv1");
            return (Criteria) this;
        }

        public Criteria andAdv1GreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_ADV1 >=", value, "adv1");
            return (Criteria) this;
        }

        public Criteria andAdv1LessThan(String value) {
            addCriterion("WAHO_ADV1 <", value, "adv1");
            return (Criteria) this;
        }

        public Criteria andAdv1LessThanOrEqualTo(String value) {
            addCriterion("WAHO_ADV1 <=", value, "adv1");
            return (Criteria) this;
        }

        public Criteria andAdv1Like(String value) {
            addCriterion("WAHO_ADV1 like", value, "adv1");
            return (Criteria) this;
        }

        public Criteria andAdv1NotLike(String value) {
            addCriterion("WAHO_ADV1 not like", value, "adv1");
            return (Criteria) this;
        }

        public Criteria andAdv1In(List<String> values) {
            addCriterion("WAHO_ADV1 in", values, "adv1");
            return (Criteria) this;
        }

        public Criteria andAdv1NotIn(List<String> values) {
            addCriterion("WAHO_ADV1 not in", values, "adv1");
            return (Criteria) this;
        }

        public Criteria andAdv1Between(String value1, String value2) {
            addCriterion("WAHO_ADV1 between", value1, value2, "adv1");
            return (Criteria) this;
        }

        public Criteria andAdv1NotBetween(String value1, String value2) {
            addCriterion("WAHO_ADV1 not between", value1, value2, "adv1");
            return (Criteria) this;
        }

        public Criteria andAdv2IsNull() {
            addCriterion("WAHO_ADV2 is null");
            return (Criteria) this;
        }

        public Criteria andAdv2IsNotNull() {
            addCriterion("WAHO_ADV2 is not null");
            return (Criteria) this;
        }

        public Criteria andAdv2EqualTo(String value) {
            addCriterion("WAHO_ADV2 =", value, "adv2");
            return (Criteria) this;
        }

        public Criteria andAdv2NotEqualTo(String value) {
            addCriterion("WAHO_ADV2 <>", value, "adv2");
            return (Criteria) this;
        }

        public Criteria andAdv2GreaterThan(String value) {
            addCriterion("WAHO_ADV2 >", value, "adv2");
            return (Criteria) this;
        }

        public Criteria andAdv2GreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_ADV2 >=", value, "adv2");
            return (Criteria) this;
        }

        public Criteria andAdv2LessThan(String value) {
            addCriterion("WAHO_ADV2 <", value, "adv2");
            return (Criteria) this;
        }

        public Criteria andAdv2LessThanOrEqualTo(String value) {
            addCriterion("WAHO_ADV2 <=", value, "adv2");
            return (Criteria) this;
        }

        public Criteria andAdv2Like(String value) {
            addCriterion("WAHO_ADV2 like", value, "adv2");
            return (Criteria) this;
        }

        public Criteria andAdv2NotLike(String value) {
            addCriterion("WAHO_ADV2 not like", value, "adv2");
            return (Criteria) this;
        }

        public Criteria andAdv2In(List<String> values) {
            addCriterion("WAHO_ADV2 in", values, "adv2");
            return (Criteria) this;
        }

        public Criteria andAdv2NotIn(List<String> values) {
            addCriterion("WAHO_ADV2 not in", values, "adv2");
            return (Criteria) this;
        }

        public Criteria andAdv2Between(String value1, String value2) {
            addCriterion("WAHO_ADV2 between", value1, value2, "adv2");
            return (Criteria) this;
        }

        public Criteria andAdv2NotBetween(String value1, String value2) {
            addCriterion("WAHO_ADV2 not between", value1, value2, "adv2");
            return (Criteria) this;
        }

        public Criteria andSmonthPriceIsNull() {
            addCriterion("WAHO_SMONTH_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSmonthPriceIsNotNull() {
            addCriterion("WAHO_SMONTH_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSmonthPriceEqualTo(String value) {
            addCriterion("WAHO_SMONTH_PRICE =", value, "smonthPrice");
            return (Criteria) this;
        }

        public Criteria andSmonthPriceNotEqualTo(String value) {
            addCriterion("WAHO_SMONTH_PRICE <>", value, "smonthPrice");
            return (Criteria) this;
        }

        public Criteria andSmonthPriceGreaterThan(String value) {
            addCriterion("WAHO_SMONTH_PRICE >", value, "smonthPrice");
            return (Criteria) this;
        }

        public Criteria andSmonthPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_SMONTH_PRICE >=", value, "smonthPrice");
            return (Criteria) this;
        }

        public Criteria andSmonthPriceLessThan(String value) {
            addCriterion("WAHO_SMONTH_PRICE <", value, "smonthPrice");
            return (Criteria) this;
        }

        public Criteria andSmonthPriceLessThanOrEqualTo(String value) {
            addCriterion("WAHO_SMONTH_PRICE <=", value, "smonthPrice");
            return (Criteria) this;
        }

        public Criteria andSmonthPriceLike(String value) {
            addCriterion("WAHO_SMONTH_PRICE like", value, "smonthPrice");
            return (Criteria) this;
        }

        public Criteria andSmonthPriceNotLike(String value) {
            addCriterion("WAHO_SMONTH_PRICE not like", value, "smonthPrice");
            return (Criteria) this;
        }

        public Criteria andSmonthPriceIn(List<String> values) {
            addCriterion("WAHO_SMONTH_PRICE in", values, "smonthPrice");
            return (Criteria) this;
        }

        public Criteria andSmonthPriceNotIn(List<String> values) {
            addCriterion("WAHO_SMONTH_PRICE not in", values, "smonthPrice");
            return (Criteria) this;
        }

        public Criteria andSmonthPriceBetween(String value1, String value2) {
            addCriterion("WAHO_SMONTH_PRICE between", value1, value2, "smonthPrice");
            return (Criteria) this;
        }

        public Criteria andSmonthPriceNotBetween(String value1, String value2) {
            addCriterion("WAHO_SMONTH_PRICE not between", value1, value2, "smonthPrice");
            return (Criteria) this;
        }

        public Criteria andSdayPriceIsNull() {
            addCriterion("WAHO_SDAY_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSdayPriceIsNotNull() {
            addCriterion("WAHO_SDAY_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSdayPriceEqualTo(String value) {
            addCriterion("WAHO_SDAY_PRICE =", value, "sdayPrice");
            return (Criteria) this;
        }

        public Criteria andSdayPriceNotEqualTo(String value) {
            addCriterion("WAHO_SDAY_PRICE <>", value, "sdayPrice");
            return (Criteria) this;
        }

        public Criteria andSdayPriceGreaterThan(String value) {
            addCriterion("WAHO_SDAY_PRICE >", value, "sdayPrice");
            return (Criteria) this;
        }

        public Criteria andSdayPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_SDAY_PRICE >=", value, "sdayPrice");
            return (Criteria) this;
        }

        public Criteria andSdayPriceLessThan(String value) {
            addCriterion("WAHO_SDAY_PRICE <", value, "sdayPrice");
            return (Criteria) this;
        }

        public Criteria andSdayPriceLessThanOrEqualTo(String value) {
            addCriterion("WAHO_SDAY_PRICE <=", value, "sdayPrice");
            return (Criteria) this;
        }

        public Criteria andSdayPriceLike(String value) {
            addCriterion("WAHO_SDAY_PRICE like", value, "sdayPrice");
            return (Criteria) this;
        }

        public Criteria andSdayPriceNotLike(String value) {
            addCriterion("WAHO_SDAY_PRICE not like", value, "sdayPrice");
            return (Criteria) this;
        }

        public Criteria andSdayPriceIn(List<String> values) {
            addCriterion("WAHO_SDAY_PRICE in", values, "sdayPrice");
            return (Criteria) this;
        }

        public Criteria andSdayPriceNotIn(List<String> values) {
            addCriterion("WAHO_SDAY_PRICE not in", values, "sdayPrice");
            return (Criteria) this;
        }

        public Criteria andSdayPriceBetween(String value1, String value2) {
            addCriterion("WAHO_SDAY_PRICE between", value1, value2, "sdayPrice");
            return (Criteria) this;
        }

        public Criteria andSdayPriceNotBetween(String value1, String value2) {
            addCriterion("WAHO_SDAY_PRICE not between", value1, value2, "sdayPrice");
            return (Criteria) this;
        }

        public Criteria andMmonthPriceIsNull() {
            addCriterion("WAHO_MMONTH_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andMmonthPriceIsNotNull() {
            addCriterion("WAHO_MMONTH_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMmonthPriceEqualTo(String value) {
            addCriterion("WAHO_MMONTH_PRICE =", value, "mmonthPrice");
            return (Criteria) this;
        }

        public Criteria andMmonthPriceNotEqualTo(String value) {
            addCriterion("WAHO_MMONTH_PRICE <>", value, "mmonthPrice");
            return (Criteria) this;
        }

        public Criteria andMmonthPriceGreaterThan(String value) {
            addCriterion("WAHO_MMONTH_PRICE >", value, "mmonthPrice");
            return (Criteria) this;
        }

        public Criteria andMmonthPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_MMONTH_PRICE >=", value, "mmonthPrice");
            return (Criteria) this;
        }

        public Criteria andMmonthPriceLessThan(String value) {
            addCriterion("WAHO_MMONTH_PRICE <", value, "mmonthPrice");
            return (Criteria) this;
        }

        public Criteria andMmonthPriceLessThanOrEqualTo(String value) {
            addCriterion("WAHO_MMONTH_PRICE <=", value, "mmonthPrice");
            return (Criteria) this;
        }

        public Criteria andMmonthPriceLike(String value) {
            addCriterion("WAHO_MMONTH_PRICE like", value, "mmonthPrice");
            return (Criteria) this;
        }

        public Criteria andMmonthPriceNotLike(String value) {
            addCriterion("WAHO_MMONTH_PRICE not like", value, "mmonthPrice");
            return (Criteria) this;
        }

        public Criteria andMmonthPriceIn(List<String> values) {
            addCriterion("WAHO_MMONTH_PRICE in", values, "mmonthPrice");
            return (Criteria) this;
        }

        public Criteria andMmonthPriceNotIn(List<String> values) {
            addCriterion("WAHO_MMONTH_PRICE not in", values, "mmonthPrice");
            return (Criteria) this;
        }

        public Criteria andMmonthPriceBetween(String value1, String value2) {
            addCriterion("WAHO_MMONTH_PRICE between", value1, value2, "mmonthPrice");
            return (Criteria) this;
        }

        public Criteria andMmonthPriceNotBetween(String value1, String value2) {
            addCriterion("WAHO_MMONTH_PRICE not between", value1, value2, "mmonthPrice");
            return (Criteria) this;
        }

        public Criteria andMdayPriceIsNull() {
            addCriterion("WAHO_MDAY_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andMdayPriceIsNotNull() {
            addCriterion("WAHO_MDAY_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMdayPriceEqualTo(String value) {
            addCriterion("WAHO_MDAY_PRICE =", value, "mdayPrice");
            return (Criteria) this;
        }

        public Criteria andMdayPriceNotEqualTo(String value) {
            addCriterion("WAHO_MDAY_PRICE <>", value, "mdayPrice");
            return (Criteria) this;
        }

        public Criteria andMdayPriceGreaterThan(String value) {
            addCriterion("WAHO_MDAY_PRICE >", value, "mdayPrice");
            return (Criteria) this;
        }

        public Criteria andMdayPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_MDAY_PRICE >=", value, "mdayPrice");
            return (Criteria) this;
        }

        public Criteria andMdayPriceLessThan(String value) {
            addCriterion("WAHO_MDAY_PRICE <", value, "mdayPrice");
            return (Criteria) this;
        }

        public Criteria andMdayPriceLessThanOrEqualTo(String value) {
            addCriterion("WAHO_MDAY_PRICE <=", value, "mdayPrice");
            return (Criteria) this;
        }

        public Criteria andMdayPriceLike(String value) {
            addCriterion("WAHO_MDAY_PRICE like", value, "mdayPrice");
            return (Criteria) this;
        }

        public Criteria andMdayPriceNotLike(String value) {
            addCriterion("WAHO_MDAY_PRICE not like", value, "mdayPrice");
            return (Criteria) this;
        }

        public Criteria andMdayPriceIn(List<String> values) {
            addCriterion("WAHO_MDAY_PRICE in", values, "mdayPrice");
            return (Criteria) this;
        }

        public Criteria andMdayPriceNotIn(List<String> values) {
            addCriterion("WAHO_MDAY_PRICE not in", values, "mdayPrice");
            return (Criteria) this;
        }

        public Criteria andMdayPriceBetween(String value1, String value2) {
            addCriterion("WAHO_MDAY_PRICE between", value1, value2, "mdayPrice");
            return (Criteria) this;
        }

        public Criteria andMdayPriceNotBetween(String value1, String value2) {
            addCriterion("WAHO_MDAY_PRICE not between", value1, value2, "mdayPrice");
            return (Criteria) this;
        }

        public Criteria andBmonthPriceIsNull() {
            addCriterion("WAHO_BMONTH_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andBmonthPriceIsNotNull() {
            addCriterion("WAHO_BMONTH_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andBmonthPriceEqualTo(String value) {
            addCriterion("WAHO_BMONTH_PRICE =", value, "bmonthPrice");
            return (Criteria) this;
        }

        public Criteria andBmonthPriceNotEqualTo(String value) {
            addCriterion("WAHO_BMONTH_PRICE <>", value, "bmonthPrice");
            return (Criteria) this;
        }

        public Criteria andBmonthPriceGreaterThan(String value) {
            addCriterion("WAHO_BMONTH_PRICE >", value, "bmonthPrice");
            return (Criteria) this;
        }

        public Criteria andBmonthPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_BMONTH_PRICE >=", value, "bmonthPrice");
            return (Criteria) this;
        }

        public Criteria andBmonthPriceLessThan(String value) {
            addCriterion("WAHO_BMONTH_PRICE <", value, "bmonthPrice");
            return (Criteria) this;
        }

        public Criteria andBmonthPriceLessThanOrEqualTo(String value) {
            addCriterion("WAHO_BMONTH_PRICE <=", value, "bmonthPrice");
            return (Criteria) this;
        }

        public Criteria andBmonthPriceLike(String value) {
            addCriterion("WAHO_BMONTH_PRICE like", value, "bmonthPrice");
            return (Criteria) this;
        }

        public Criteria andBmonthPriceNotLike(String value) {
            addCriterion("WAHO_BMONTH_PRICE not like", value, "bmonthPrice");
            return (Criteria) this;
        }

        public Criteria andBmonthPriceIn(List<String> values) {
            addCriterion("WAHO_BMONTH_PRICE in", values, "bmonthPrice");
            return (Criteria) this;
        }

        public Criteria andBmonthPriceNotIn(List<String> values) {
            addCriterion("WAHO_BMONTH_PRICE not in", values, "bmonthPrice");
            return (Criteria) this;
        }

        public Criteria andBmonthPriceBetween(String value1, String value2) {
            addCriterion("WAHO_BMONTH_PRICE between", value1, value2, "bmonthPrice");
            return (Criteria) this;
        }

        public Criteria andBmonthPriceNotBetween(String value1, String value2) {
            addCriterion("WAHO_BMONTH_PRICE not between", value1, value2, "bmonthPrice");
            return (Criteria) this;
        }

        public Criteria andBdayPriceIsNull() {
            addCriterion("WAHO_BDAY_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andBdayPriceIsNotNull() {
            addCriterion("WAHO_BDAY_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andBdayPriceEqualTo(String value) {
            addCriterion("WAHO_BDAY_PRICE =", value, "bdayPrice");
            return (Criteria) this;
        }

        public Criteria andBdayPriceNotEqualTo(String value) {
            addCriterion("WAHO_BDAY_PRICE <>", value, "bdayPrice");
            return (Criteria) this;
        }

        public Criteria andBdayPriceGreaterThan(String value) {
            addCriterion("WAHO_BDAY_PRICE >", value, "bdayPrice");
            return (Criteria) this;
        }

        public Criteria andBdayPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_BDAY_PRICE >=", value, "bdayPrice");
            return (Criteria) this;
        }

        public Criteria andBdayPriceLessThan(String value) {
            addCriterion("WAHO_BDAY_PRICE <", value, "bdayPrice");
            return (Criteria) this;
        }

        public Criteria andBdayPriceLessThanOrEqualTo(String value) {
            addCriterion("WAHO_BDAY_PRICE <=", value, "bdayPrice");
            return (Criteria) this;
        }

        public Criteria andBdayPriceLike(String value) {
            addCriterion("WAHO_BDAY_PRICE like", value, "bdayPrice");
            return (Criteria) this;
        }

        public Criteria andBdayPriceNotLike(String value) {
            addCriterion("WAHO_BDAY_PRICE not like", value, "bdayPrice");
            return (Criteria) this;
        }

        public Criteria andBdayPriceIn(List<String> values) {
            addCriterion("WAHO_BDAY_PRICE in", values, "bdayPrice");
            return (Criteria) this;
        }

        public Criteria andBdayPriceNotIn(List<String> values) {
            addCriterion("WAHO_BDAY_PRICE not in", values, "bdayPrice");
            return (Criteria) this;
        }

        public Criteria andBdayPriceBetween(String value1, String value2) {
            addCriterion("WAHO_BDAY_PRICE between", value1, value2, "bdayPrice");
            return (Criteria) this;
        }

        public Criteria andBdayPriceNotBetween(String value1, String value2) {
            addCriterion("WAHO_BDAY_PRICE not between", value1, value2, "bdayPrice");
            return (Criteria) this;
        }

        public Criteria andCmonthPriceIsNull() {
            addCriterion("WAHO_CMONTH_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCmonthPriceIsNotNull() {
            addCriterion("WAHO_CMONTH_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCmonthPriceEqualTo(String value) {
            addCriterion("WAHO_CMONTH_PRICE =", value, "cmonthPrice");
            return (Criteria) this;
        }

        public Criteria andCmonthPriceNotEqualTo(String value) {
            addCriterion("WAHO_CMONTH_PRICE <>", value, "cmonthPrice");
            return (Criteria) this;
        }

        public Criteria andCmonthPriceGreaterThan(String value) {
            addCriterion("WAHO_CMONTH_PRICE >", value, "cmonthPrice");
            return (Criteria) this;
        }

        public Criteria andCmonthPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_CMONTH_PRICE >=", value, "cmonthPrice");
            return (Criteria) this;
        }

        public Criteria andCmonthPriceLessThan(String value) {
            addCriterion("WAHO_CMONTH_PRICE <", value, "cmonthPrice");
            return (Criteria) this;
        }

        public Criteria andCmonthPriceLessThanOrEqualTo(String value) {
            addCriterion("WAHO_CMONTH_PRICE <=", value, "cmonthPrice");
            return (Criteria) this;
        }

        public Criteria andCmonthPriceLike(String value) {
            addCriterion("WAHO_CMONTH_PRICE like", value, "cmonthPrice");
            return (Criteria) this;
        }

        public Criteria andCmonthPriceNotLike(String value) {
            addCriterion("WAHO_CMONTH_PRICE not like", value, "cmonthPrice");
            return (Criteria) this;
        }

        public Criteria andCmonthPriceIn(List<String> values) {
            addCriterion("WAHO_CMONTH_PRICE in", values, "cmonthPrice");
            return (Criteria) this;
        }

        public Criteria andCmonthPriceNotIn(List<String> values) {
            addCriterion("WAHO_CMONTH_PRICE not in", values, "cmonthPrice");
            return (Criteria) this;
        }

        public Criteria andCmonthPriceBetween(String value1, String value2) {
            addCriterion("WAHO_CMONTH_PRICE between", value1, value2, "cmonthPrice");
            return (Criteria) this;
        }

        public Criteria andCmonthPriceNotBetween(String value1, String value2) {
            addCriterion("WAHO_CMONTH_PRICE not between", value1, value2, "cmonthPrice");
            return (Criteria) this;
        }

        public Criteria andCdayPriceIsNull() {
            addCriterion("WAHO_CDAY_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCdayPriceIsNotNull() {
            addCriterion("WAHO_CDAY_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCdayPriceEqualTo(String value) {
            addCriterion("WAHO_CDAY_PRICE =", value, "cdayPrice");
            return (Criteria) this;
        }

        public Criteria andCdayPriceNotEqualTo(String value) {
            addCriterion("WAHO_CDAY_PRICE <>", value, "cdayPrice");
            return (Criteria) this;
        }

        public Criteria andCdayPriceGreaterThan(String value) {
            addCriterion("WAHO_CDAY_PRICE >", value, "cdayPrice");
            return (Criteria) this;
        }

        public Criteria andCdayPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_CDAY_PRICE >=", value, "cdayPrice");
            return (Criteria) this;
        }

        public Criteria andCdayPriceLessThan(String value) {
            addCriterion("WAHO_CDAY_PRICE <", value, "cdayPrice");
            return (Criteria) this;
        }

        public Criteria andCdayPriceLessThanOrEqualTo(String value) {
            addCriterion("WAHO_CDAY_PRICE <=", value, "cdayPrice");
            return (Criteria) this;
        }

        public Criteria andCdayPriceLike(String value) {
            addCriterion("WAHO_CDAY_PRICE like", value, "cdayPrice");
            return (Criteria) this;
        }

        public Criteria andCdayPriceNotLike(String value) {
            addCriterion("WAHO_CDAY_PRICE not like", value, "cdayPrice");
            return (Criteria) this;
        }

        public Criteria andCdayPriceIn(List<String> values) {
            addCriterion("WAHO_CDAY_PRICE in", values, "cdayPrice");
            return (Criteria) this;
        }

        public Criteria andCdayPriceNotIn(List<String> values) {
            addCriterion("WAHO_CDAY_PRICE not in", values, "cdayPrice");
            return (Criteria) this;
        }

        public Criteria andCdayPriceBetween(String value1, String value2) {
            addCriterion("WAHO_CDAY_PRICE between", value1, value2, "cdayPrice");
            return (Criteria) this;
        }

        public Criteria andCdayPriceNotBetween(String value1, String value2) {
            addCriterion("WAHO_CDAY_PRICE not between", value1, value2, "cdayPrice");
            return (Criteria) this;
        }

        public Criteria andRmonthPriceIsNull() {
            addCriterion("WAHO_RMONTH_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andRmonthPriceIsNotNull() {
            addCriterion("WAHO_RMONTH_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRmonthPriceEqualTo(String value) {
            addCriterion("WAHO_RMONTH_PRICE =", value, "rmonthPrice");
            return (Criteria) this;
        }

        public Criteria andRmonthPriceNotEqualTo(String value) {
            addCriterion("WAHO_RMONTH_PRICE <>", value, "rmonthPrice");
            return (Criteria) this;
        }

        public Criteria andRmonthPriceGreaterThan(String value) {
            addCriterion("WAHO_RMONTH_PRICE >", value, "rmonthPrice");
            return (Criteria) this;
        }

        public Criteria andRmonthPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_RMONTH_PRICE >=", value, "rmonthPrice");
            return (Criteria) this;
        }

        public Criteria andRmonthPriceLessThan(String value) {
            addCriterion("WAHO_RMONTH_PRICE <", value, "rmonthPrice");
            return (Criteria) this;
        }

        public Criteria andRmonthPriceLessThanOrEqualTo(String value) {
            addCriterion("WAHO_RMONTH_PRICE <=", value, "rmonthPrice");
            return (Criteria) this;
        }

        public Criteria andRmonthPriceLike(String value) {
            addCriterion("WAHO_RMONTH_PRICE like", value, "rmonthPrice");
            return (Criteria) this;
        }

        public Criteria andRmonthPriceNotLike(String value) {
            addCriterion("WAHO_RMONTH_PRICE not like", value, "rmonthPrice");
            return (Criteria) this;
        }

        public Criteria andRmonthPriceIn(List<String> values) {
            addCriterion("WAHO_RMONTH_PRICE in", values, "rmonthPrice");
            return (Criteria) this;
        }

        public Criteria andRmonthPriceNotIn(List<String> values) {
            addCriterion("WAHO_RMONTH_PRICE not in", values, "rmonthPrice");
            return (Criteria) this;
        }

        public Criteria andRmonthPriceBetween(String value1, String value2) {
            addCriterion("WAHO_RMONTH_PRICE between", value1, value2, "rmonthPrice");
            return (Criteria) this;
        }

        public Criteria andRmonthPriceNotBetween(String value1, String value2) {
            addCriterion("WAHO_RMONTH_PRICE not between", value1, value2, "rmonthPrice");
            return (Criteria) this;
        }

        public Criteria andRdayPriceIsNull() {
            addCriterion("WAHO_RDAY_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andRdayPriceIsNotNull() {
            addCriterion("WAHO_RDAY_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRdayPriceEqualTo(String value) {
            addCriterion("WAHO_RDAY_PRICE =", value, "rdayPrice");
            return (Criteria) this;
        }

        public Criteria andRdayPriceNotEqualTo(String value) {
            addCriterion("WAHO_RDAY_PRICE <>", value, "rdayPrice");
            return (Criteria) this;
        }

        public Criteria andRdayPriceGreaterThan(String value) {
            addCriterion("WAHO_RDAY_PRICE >", value, "rdayPrice");
            return (Criteria) this;
        }

        public Criteria andRdayPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_RDAY_PRICE >=", value, "rdayPrice");
            return (Criteria) this;
        }

        public Criteria andRdayPriceLessThan(String value) {
            addCriterion("WAHO_RDAY_PRICE <", value, "rdayPrice");
            return (Criteria) this;
        }

        public Criteria andRdayPriceLessThanOrEqualTo(String value) {
            addCriterion("WAHO_RDAY_PRICE <=", value, "rdayPrice");
            return (Criteria) this;
        }

        public Criteria andRdayPriceLike(String value) {
            addCriterion("WAHO_RDAY_PRICE like", value, "rdayPrice");
            return (Criteria) this;
        }

        public Criteria andRdayPriceNotLike(String value) {
            addCriterion("WAHO_RDAY_PRICE not like", value, "rdayPrice");
            return (Criteria) this;
        }

        public Criteria andRdayPriceIn(List<String> values) {
            addCriterion("WAHO_RDAY_PRICE in", values, "rdayPrice");
            return (Criteria) this;
        }

        public Criteria andRdayPriceNotIn(List<String> values) {
            addCriterion("WAHO_RDAY_PRICE not in", values, "rdayPrice");
            return (Criteria) this;
        }

        public Criteria andRdayPriceBetween(String value1, String value2) {
            addCriterion("WAHO_RDAY_PRICE between", value1, value2, "rdayPrice");
            return (Criteria) this;
        }

        public Criteria andRdayPriceNotBetween(String value1, String value2) {
            addCriterion("WAHO_RDAY_PRICE not between", value1, value2, "rdayPrice");
            return (Criteria) this;
        }

        public Criteria andLmonthPriceIsNull() {
            addCriterion("WAHO_LMONTH_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andLmonthPriceIsNotNull() {
            addCriterion("WAHO_LMONTH_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andLmonthPriceEqualTo(String value) {
            addCriterion("WAHO_LMONTH_PRICE =", value, "lmonthPrice");
            return (Criteria) this;
        }

        public Criteria andLmonthPriceNotEqualTo(String value) {
            addCriterion("WAHO_LMONTH_PRICE <>", value, "lmonthPrice");
            return (Criteria) this;
        }

        public Criteria andLmonthPriceGreaterThan(String value) {
            addCriterion("WAHO_LMONTH_PRICE >", value, "lmonthPrice");
            return (Criteria) this;
        }

        public Criteria andLmonthPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_LMONTH_PRICE >=", value, "lmonthPrice");
            return (Criteria) this;
        }

        public Criteria andLmonthPriceLessThan(String value) {
            addCriterion("WAHO_LMONTH_PRICE <", value, "lmonthPrice");
            return (Criteria) this;
        }

        public Criteria andLmonthPriceLessThanOrEqualTo(String value) {
            addCriterion("WAHO_LMONTH_PRICE <=", value, "lmonthPrice");
            return (Criteria) this;
        }

        public Criteria andLmonthPriceLike(String value) {
            addCriterion("WAHO_LMONTH_PRICE like", value, "lmonthPrice");
            return (Criteria) this;
        }

        public Criteria andLmonthPriceNotLike(String value) {
            addCriterion("WAHO_LMONTH_PRICE not like", value, "lmonthPrice");
            return (Criteria) this;
        }

        public Criteria andLmonthPriceIn(List<String> values) {
            addCriterion("WAHO_LMONTH_PRICE in", values, "lmonthPrice");
            return (Criteria) this;
        }

        public Criteria andLmonthPriceNotIn(List<String> values) {
            addCriterion("WAHO_LMONTH_PRICE not in", values, "lmonthPrice");
            return (Criteria) this;
        }

        public Criteria andLmonthPriceBetween(String value1, String value2) {
            addCriterion("WAHO_LMONTH_PRICE between", value1, value2, "lmonthPrice");
            return (Criteria) this;
        }

        public Criteria andLmonthPriceNotBetween(String value1, String value2) {
            addCriterion("WAHO_LMONTH_PRICE not between", value1, value2, "lmonthPrice");
            return (Criteria) this;
        }

        public Criteria andLdayPriceIsNull() {
            addCriterion("WAHO_LDAY_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andLdayPriceIsNotNull() {
            addCriterion("WAHO_LDAY_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andLdayPriceEqualTo(String value) {
            addCriterion("WAHO_LDAY_PRICE =", value, "ldayPrice");
            return (Criteria) this;
        }

        public Criteria andLdayPriceNotEqualTo(String value) {
            addCriterion("WAHO_LDAY_PRICE <>", value, "ldayPrice");
            return (Criteria) this;
        }

        public Criteria andLdayPriceGreaterThan(String value) {
            addCriterion("WAHO_LDAY_PRICE >", value, "ldayPrice");
            return (Criteria) this;
        }

        public Criteria andLdayPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_LDAY_PRICE >=", value, "ldayPrice");
            return (Criteria) this;
        }

        public Criteria andLdayPriceLessThan(String value) {
            addCriterion("WAHO_LDAY_PRICE <", value, "ldayPrice");
            return (Criteria) this;
        }

        public Criteria andLdayPriceLessThanOrEqualTo(String value) {
            addCriterion("WAHO_LDAY_PRICE <=", value, "ldayPrice");
            return (Criteria) this;
        }

        public Criteria andLdayPriceLike(String value) {
            addCriterion("WAHO_LDAY_PRICE like", value, "ldayPrice");
            return (Criteria) this;
        }

        public Criteria andLdayPriceNotLike(String value) {
            addCriterion("WAHO_LDAY_PRICE not like", value, "ldayPrice");
            return (Criteria) this;
        }

        public Criteria andLdayPriceIn(List<String> values) {
            addCriterion("WAHO_LDAY_PRICE in", values, "ldayPrice");
            return (Criteria) this;
        }

        public Criteria andLdayPriceNotIn(List<String> values) {
            addCriterion("WAHO_LDAY_PRICE not in", values, "ldayPrice");
            return (Criteria) this;
        }

        public Criteria andLdayPriceBetween(String value1, String value2) {
            addCriterion("WAHO_LDAY_PRICE between", value1, value2, "ldayPrice");
            return (Criteria) this;
        }

        public Criteria andLdayPriceNotBetween(String value1, String value2) {
            addCriterion("WAHO_LDAY_PRICE not between", value1, value2, "ldayPrice");
            return (Criteria) this;
        }

        public Criteria andIntelligentImageIsNull() {
            addCriterion("WAHO_INTELLIGENT_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andIntelligentImageIsNotNull() {
            addCriterion("WAHO_INTELLIGENT_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andIntelligentImageEqualTo(String value) {
            addCriterion("WAHO_INTELLIGENT_IMAGE =", value, "intelligentImage");
            return (Criteria) this;
        }

        public Criteria andIntelligentImageNotEqualTo(String value) {
            addCriterion("WAHO_INTELLIGENT_IMAGE <>", value, "intelligentImage");
            return (Criteria) this;
        }

        public Criteria andIntelligentImageGreaterThan(String value) {
            addCriterion("WAHO_INTELLIGENT_IMAGE >", value, "intelligentImage");
            return (Criteria) this;
        }

        public Criteria andIntelligentImageGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_INTELLIGENT_IMAGE >=", value, "intelligentImage");
            return (Criteria) this;
        }

        public Criteria andIntelligentImageLessThan(String value) {
            addCriterion("WAHO_INTELLIGENT_IMAGE <", value, "intelligentImage");
            return (Criteria) this;
        }

        public Criteria andIntelligentImageLessThanOrEqualTo(String value) {
            addCriterion("WAHO_INTELLIGENT_IMAGE <=", value, "intelligentImage");
            return (Criteria) this;
        }

        public Criteria andIntelligentImageLike(String value) {
            addCriterion("WAHO_INTELLIGENT_IMAGE like", value, "intelligentImage");
            return (Criteria) this;
        }

        public Criteria andIntelligentImageNotLike(String value) {
            addCriterion("WAHO_INTELLIGENT_IMAGE not like", value, "intelligentImage");
            return (Criteria) this;
        }

        public Criteria andIntelligentImageIn(List<String> values) {
            addCriterion("WAHO_INTELLIGENT_IMAGE in", values, "intelligentImage");
            return (Criteria) this;
        }

        public Criteria andIntelligentImageNotIn(List<String> values) {
            addCriterion("WAHO_INTELLIGENT_IMAGE not in", values, "intelligentImage");
            return (Criteria) this;
        }

        public Criteria andIntelligentImageBetween(String value1, String value2) {
            addCriterion("WAHO_INTELLIGENT_IMAGE between", value1, value2, "intelligentImage");
            return (Criteria) this;
        }

        public Criteria andIntelligentImageNotBetween(String value1, String value2) {
            addCriterion("WAHO_INTELLIGENT_IMAGE not between", value1, value2, "intelligentImage");
            return (Criteria) this;
        }

        public Criteria andImmediateImageIsNull() {
            addCriterion("WAHO_IMMEDIATE_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andImmediateImageIsNotNull() {
            addCriterion("WAHO_IMMEDIATE_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andImmediateImageEqualTo(String value) {
            addCriterion("WAHO_IMMEDIATE_IMAGE =", value, "immediateImage");
            return (Criteria) this;
        }

        public Criteria andImmediateImageNotEqualTo(String value) {
            addCriterion("WAHO_IMMEDIATE_IMAGE <>", value, "immediateImage");
            return (Criteria) this;
        }

        public Criteria andImmediateImageGreaterThan(String value) {
            addCriterion("WAHO_IMMEDIATE_IMAGE >", value, "immediateImage");
            return (Criteria) this;
        }

        public Criteria andImmediateImageGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_IMMEDIATE_IMAGE >=", value, "immediateImage");
            return (Criteria) this;
        }

        public Criteria andImmediateImageLessThan(String value) {
            addCriterion("WAHO_IMMEDIATE_IMAGE <", value, "immediateImage");
            return (Criteria) this;
        }

        public Criteria andImmediateImageLessThanOrEqualTo(String value) {
            addCriterion("WAHO_IMMEDIATE_IMAGE <=", value, "immediateImage");
            return (Criteria) this;
        }

        public Criteria andImmediateImageLike(String value) {
            addCriterion("WAHO_IMMEDIATE_IMAGE like", value, "immediateImage");
            return (Criteria) this;
        }

        public Criteria andImmediateImageNotLike(String value) {
            addCriterion("WAHO_IMMEDIATE_IMAGE not like", value, "immediateImage");
            return (Criteria) this;
        }

        public Criteria andImmediateImageIn(List<String> values) {
            addCriterion("WAHO_IMMEDIATE_IMAGE in", values, "immediateImage");
            return (Criteria) this;
        }

        public Criteria andImmediateImageNotIn(List<String> values) {
            addCriterion("WAHO_IMMEDIATE_IMAGE not in", values, "immediateImage");
            return (Criteria) this;
        }

        public Criteria andImmediateImageBetween(String value1, String value2) {
            addCriterion("WAHO_IMMEDIATE_IMAGE between", value1, value2, "immediateImage");
            return (Criteria) this;
        }

        public Criteria andImmediateImageNotBetween(String value1, String value2) {
            addCriterion("WAHO_IMMEDIATE_IMAGE not between", value1, value2, "immediateImage");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIsNull() {
            addCriterion("WAHO_QRCODE_URL is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIsNotNull() {
            addCriterion("WAHO_QRCODE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlEqualTo(String value) {
            addCriterion("WAHO_QRCODE_URL =", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotEqualTo(String value) {
            addCriterion("WAHO_QRCODE_URL <>", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlGreaterThan(String value) {
            addCriterion("WAHO_QRCODE_URL >", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_QRCODE_URL >=", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLessThan(String value) {
            addCriterion("WAHO_QRCODE_URL <", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLessThanOrEqualTo(String value) {
            addCriterion("WAHO_QRCODE_URL <=", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLike(String value) {
            addCriterion("WAHO_QRCODE_URL like", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotLike(String value) {
            addCriterion("WAHO_QRCODE_URL not like", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIn(List<String> values) {
            addCriterion("WAHO_QRCODE_URL in", values, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotIn(List<String> values) {
            addCriterion("WAHO_QRCODE_URL not in", values, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlBetween(String value1, String value2) {
            addCriterion("WAHO_QRCODE_URL between", value1, value2, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotBetween(String value1, String value2) {
            addCriterion("WAHO_QRCODE_URL not between", value1, value2, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andPriceIntroIsNull() {
            addCriterion("WAHO_PRICE_INTRO is null");
            return (Criteria) this;
        }

        public Criteria andPriceIntroIsNotNull() {
            addCriterion("WAHO_PRICE_INTRO is not null");
            return (Criteria) this;
        }

        public Criteria andPriceIntroEqualTo(String value) {
            addCriterion("WAHO_PRICE_INTRO =", value, "priceIntro");
            return (Criteria) this;
        }

        public Criteria andPriceIntroNotEqualTo(String value) {
            addCriterion("WAHO_PRICE_INTRO <>", value, "priceIntro");
            return (Criteria) this;
        }

        public Criteria andPriceIntroGreaterThan(String value) {
            addCriterion("WAHO_PRICE_INTRO >", value, "priceIntro");
            return (Criteria) this;
        }

        public Criteria andPriceIntroGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_PRICE_INTRO >=", value, "priceIntro");
            return (Criteria) this;
        }

        public Criteria andPriceIntroLessThan(String value) {
            addCriterion("WAHO_PRICE_INTRO <", value, "priceIntro");
            return (Criteria) this;
        }

        public Criteria andPriceIntroLessThanOrEqualTo(String value) {
            addCriterion("WAHO_PRICE_INTRO <=", value, "priceIntro");
            return (Criteria) this;
        }

        public Criteria andPriceIntroLike(String value) {
            addCriterion("WAHO_PRICE_INTRO like", value, "priceIntro");
            return (Criteria) this;
        }

        public Criteria andPriceIntroNotLike(String value) {
            addCriterion("WAHO_PRICE_INTRO not like", value, "priceIntro");
            return (Criteria) this;
        }

        public Criteria andPriceIntroIn(List<String> values) {
            addCriterion("WAHO_PRICE_INTRO in", values, "priceIntro");
            return (Criteria) this;
        }

        public Criteria andPriceIntroNotIn(List<String> values) {
            addCriterion("WAHO_PRICE_INTRO not in", values, "priceIntro");
            return (Criteria) this;
        }

        public Criteria andPriceIntroBetween(String value1, String value2) {
            addCriterion("WAHO_PRICE_INTRO between", value1, value2, "priceIntro");
            return (Criteria) this;
        }

        public Criteria andPriceIntroNotBetween(String value1, String value2) {
            addCriterion("WAHO_PRICE_INTRO not between", value1, value2, "priceIntro");
            return (Criteria) this;
        }

        public Criteria andHourStartIsNull() {
            addCriterion("WAHO_HOUR_START is null");
            return (Criteria) this;
        }

        public Criteria andHourStartIsNotNull() {
            addCriterion("WAHO_HOUR_START is not null");
            return (Criteria) this;
        }

        public Criteria andHourStartEqualTo(String value) {
            addCriterion("WAHO_HOUR_START =", value, "hourStart");
            return (Criteria) this;
        }

        public Criteria andHourStartNotEqualTo(String value) {
            addCriterion("WAHO_HOUR_START <>", value, "hourStart");
            return (Criteria) this;
        }

        public Criteria andHourStartGreaterThan(String value) {
            addCriterion("WAHO_HOUR_START >", value, "hourStart");
            return (Criteria) this;
        }

        public Criteria andHourStartGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_HOUR_START >=", value, "hourStart");
            return (Criteria) this;
        }

        public Criteria andHourStartLessThan(String value) {
            addCriterion("WAHO_HOUR_START <", value, "hourStart");
            return (Criteria) this;
        }

        public Criteria andHourStartLessThanOrEqualTo(String value) {
            addCriterion("WAHO_HOUR_START <=", value, "hourStart");
            return (Criteria) this;
        }

        public Criteria andHourStartLike(String value) {
            addCriterion("WAHO_HOUR_START like", value, "hourStart");
            return (Criteria) this;
        }

        public Criteria andHourStartNotLike(String value) {
            addCriterion("WAHO_HOUR_START not like", value, "hourStart");
            return (Criteria) this;
        }

        public Criteria andHourStartIn(List<String> values) {
            addCriterion("WAHO_HOUR_START in", values, "hourStart");
            return (Criteria) this;
        }

        public Criteria andHourStartNotIn(List<String> values) {
            addCriterion("WAHO_HOUR_START not in", values, "hourStart");
            return (Criteria) this;
        }

        public Criteria andHourStartBetween(String value1, String value2) {
            addCriterion("WAHO_HOUR_START between", value1, value2, "hourStart");
            return (Criteria) this;
        }

        public Criteria andHourStartNotBetween(String value1, String value2) {
            addCriterion("WAHO_HOUR_START not between", value1, value2, "hourStart");
            return (Criteria) this;
        }

        public Criteria andHourRenewIsNull() {
            addCriterion("WAHO_HOUR_RENEW is null");
            return (Criteria) this;
        }

        public Criteria andHourRenewIsNotNull() {
            addCriterion("WAHO_HOUR_RENEW is not null");
            return (Criteria) this;
        }

        public Criteria andHourRenewEqualTo(String value) {
            addCriterion("WAHO_HOUR_RENEW =", value, "hourRenew");
            return (Criteria) this;
        }

        public Criteria andHourRenewNotEqualTo(String value) {
            addCriterion("WAHO_HOUR_RENEW <>", value, "hourRenew");
            return (Criteria) this;
        }

        public Criteria andHourRenewGreaterThan(String value) {
            addCriterion("WAHO_HOUR_RENEW >", value, "hourRenew");
            return (Criteria) this;
        }

        public Criteria andHourRenewGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_HOUR_RENEW >=", value, "hourRenew");
            return (Criteria) this;
        }

        public Criteria andHourRenewLessThan(String value) {
            addCriterion("WAHO_HOUR_RENEW <", value, "hourRenew");
            return (Criteria) this;
        }

        public Criteria andHourRenewLessThanOrEqualTo(String value) {
            addCriterion("WAHO_HOUR_RENEW <=", value, "hourRenew");
            return (Criteria) this;
        }

        public Criteria andHourRenewLike(String value) {
            addCriterion("WAHO_HOUR_RENEW like", value, "hourRenew");
            return (Criteria) this;
        }

        public Criteria andHourRenewNotLike(String value) {
            addCriterion("WAHO_HOUR_RENEW not like", value, "hourRenew");
            return (Criteria) this;
        }

        public Criteria andHourRenewIn(List<String> values) {
            addCriterion("WAHO_HOUR_RENEW in", values, "hourRenew");
            return (Criteria) this;
        }

        public Criteria andHourRenewNotIn(List<String> values) {
            addCriterion("WAHO_HOUR_RENEW not in", values, "hourRenew");
            return (Criteria) this;
        }

        public Criteria andHourRenewBetween(String value1, String value2) {
            addCriterion("WAHO_HOUR_RENEW between", value1, value2, "hourRenew");
            return (Criteria) this;
        }

        public Criteria andHourRenewNotBetween(String value1, String value2) {
            addCriterion("WAHO_HOUR_RENEW not between", value1, value2, "hourRenew");
            return (Criteria) this;
        }

        public Criteria andDayStartIsNull() {
            addCriterion("WAHO_DAY_START is null");
            return (Criteria) this;
        }

        public Criteria andDayStartIsNotNull() {
            addCriterion("WAHO_DAY_START is not null");
            return (Criteria) this;
        }

        public Criteria andDayStartEqualTo(String value) {
            addCriterion("WAHO_DAY_START =", value, "dayStart");
            return (Criteria) this;
        }

        public Criteria andDayStartNotEqualTo(String value) {
            addCriterion("WAHO_DAY_START <>", value, "dayStart");
            return (Criteria) this;
        }

        public Criteria andDayStartGreaterThan(String value) {
            addCriterion("WAHO_DAY_START >", value, "dayStart");
            return (Criteria) this;
        }

        public Criteria andDayStartGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_DAY_START >=", value, "dayStart");
            return (Criteria) this;
        }

        public Criteria andDayStartLessThan(String value) {
            addCriterion("WAHO_DAY_START <", value, "dayStart");
            return (Criteria) this;
        }

        public Criteria andDayStartLessThanOrEqualTo(String value) {
            addCriterion("WAHO_DAY_START <=", value, "dayStart");
            return (Criteria) this;
        }

        public Criteria andDayStartLike(String value) {
            addCriterion("WAHO_DAY_START like", value, "dayStart");
            return (Criteria) this;
        }

        public Criteria andDayStartNotLike(String value) {
            addCriterion("WAHO_DAY_START not like", value, "dayStart");
            return (Criteria) this;
        }

        public Criteria andDayStartIn(List<String> values) {
            addCriterion("WAHO_DAY_START in", values, "dayStart");
            return (Criteria) this;
        }

        public Criteria andDayStartNotIn(List<String> values) {
            addCriterion("WAHO_DAY_START not in", values, "dayStart");
            return (Criteria) this;
        }

        public Criteria andDayStartBetween(String value1, String value2) {
            addCriterion("WAHO_DAY_START between", value1, value2, "dayStart");
            return (Criteria) this;
        }

        public Criteria andDayStartNotBetween(String value1, String value2) {
            addCriterion("WAHO_DAY_START not between", value1, value2, "dayStart");
            return (Criteria) this;
        }

        public Criteria andDayRenewIsNull() {
            addCriterion("WAHO_DAY_RENEW is null");
            return (Criteria) this;
        }

        public Criteria andDayRenewIsNotNull() {
            addCriterion("WAHO_DAY_RENEW is not null");
            return (Criteria) this;
        }

        public Criteria andDayRenewEqualTo(String value) {
            addCriterion("WAHO_DAY_RENEW =", value, "dayRenew");
            return (Criteria) this;
        }

        public Criteria andDayRenewNotEqualTo(String value) {
            addCriterion("WAHO_DAY_RENEW <>", value, "dayRenew");
            return (Criteria) this;
        }

        public Criteria andDayRenewGreaterThan(String value) {
            addCriterion("WAHO_DAY_RENEW >", value, "dayRenew");
            return (Criteria) this;
        }

        public Criteria andDayRenewGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_DAY_RENEW >=", value, "dayRenew");
            return (Criteria) this;
        }

        public Criteria andDayRenewLessThan(String value) {
            addCriterion("WAHO_DAY_RENEW <", value, "dayRenew");
            return (Criteria) this;
        }

        public Criteria andDayRenewLessThanOrEqualTo(String value) {
            addCriterion("WAHO_DAY_RENEW <=", value, "dayRenew");
            return (Criteria) this;
        }

        public Criteria andDayRenewLike(String value) {
            addCriterion("WAHO_DAY_RENEW like", value, "dayRenew");
            return (Criteria) this;
        }

        public Criteria andDayRenewNotLike(String value) {
            addCriterion("WAHO_DAY_RENEW not like", value, "dayRenew");
            return (Criteria) this;
        }

        public Criteria andDayRenewIn(List<String> values) {
            addCriterion("WAHO_DAY_RENEW in", values, "dayRenew");
            return (Criteria) this;
        }

        public Criteria andDayRenewNotIn(List<String> values) {
            addCriterion("WAHO_DAY_RENEW not in", values, "dayRenew");
            return (Criteria) this;
        }

        public Criteria andDayRenewBetween(String value1, String value2) {
            addCriterion("WAHO_DAY_RENEW between", value1, value2, "dayRenew");
            return (Criteria) this;
        }

        public Criteria andDayRenewNotBetween(String value1, String value2) {
            addCriterion("WAHO_DAY_RENEW not between", value1, value2, "dayRenew");
            return (Criteria) this;
        }

        public Criteria andMonthStartIsNull() {
            addCriterion("WAHO_MONTH_START is null");
            return (Criteria) this;
        }

        public Criteria andMonthStartIsNotNull() {
            addCriterion("WAHO_MONTH_START is not null");
            return (Criteria) this;
        }

        public Criteria andMonthStartEqualTo(String value) {
            addCriterion("WAHO_MONTH_START =", value, "monthStart");
            return (Criteria) this;
        }

        public Criteria andMonthStartNotEqualTo(String value) {
            addCriterion("WAHO_MONTH_START <>", value, "monthStart");
            return (Criteria) this;
        }

        public Criteria andMonthStartGreaterThan(String value) {
            addCriterion("WAHO_MONTH_START >", value, "monthStart");
            return (Criteria) this;
        }

        public Criteria andMonthStartGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_MONTH_START >=", value, "monthStart");
            return (Criteria) this;
        }

        public Criteria andMonthStartLessThan(String value) {
            addCriterion("WAHO_MONTH_START <", value, "monthStart");
            return (Criteria) this;
        }

        public Criteria andMonthStartLessThanOrEqualTo(String value) {
            addCriterion("WAHO_MONTH_START <=", value, "monthStart");
            return (Criteria) this;
        }

        public Criteria andMonthStartLike(String value) {
            addCriterion("WAHO_MONTH_START like", value, "monthStart");
            return (Criteria) this;
        }

        public Criteria andMonthStartNotLike(String value) {
            addCriterion("WAHO_MONTH_START not like", value, "monthStart");
            return (Criteria) this;
        }

        public Criteria andMonthStartIn(List<String> values) {
            addCriterion("WAHO_MONTH_START in", values, "monthStart");
            return (Criteria) this;
        }

        public Criteria andMonthStartNotIn(List<String> values) {
            addCriterion("WAHO_MONTH_START not in", values, "monthStart");
            return (Criteria) this;
        }

        public Criteria andMonthStartBetween(String value1, String value2) {
            addCriterion("WAHO_MONTH_START between", value1, value2, "monthStart");
            return (Criteria) this;
        }

        public Criteria andMonthStartNotBetween(String value1, String value2) {
            addCriterion("WAHO_MONTH_START not between", value1, value2, "monthStart");
            return (Criteria) this;
        }

        public Criteria andMonthRenewIsNull() {
            addCriterion("WAHO_MONTH_RENEW is null");
            return (Criteria) this;
        }

        public Criteria andMonthRenewIsNotNull() {
            addCriterion("WAHO_MONTH_RENEW is not null");
            return (Criteria) this;
        }

        public Criteria andMonthRenewEqualTo(String value) {
            addCriterion("WAHO_MONTH_RENEW =", value, "monthRenew");
            return (Criteria) this;
        }

        public Criteria andMonthRenewNotEqualTo(String value) {
            addCriterion("WAHO_MONTH_RENEW <>", value, "monthRenew");
            return (Criteria) this;
        }

        public Criteria andMonthRenewGreaterThan(String value) {
            addCriterion("WAHO_MONTH_RENEW >", value, "monthRenew");
            return (Criteria) this;
        }

        public Criteria andMonthRenewGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_MONTH_RENEW >=", value, "monthRenew");
            return (Criteria) this;
        }

        public Criteria andMonthRenewLessThan(String value) {
            addCriterion("WAHO_MONTH_RENEW <", value, "monthRenew");
            return (Criteria) this;
        }

        public Criteria andMonthRenewLessThanOrEqualTo(String value) {
            addCriterion("WAHO_MONTH_RENEW <=", value, "monthRenew");
            return (Criteria) this;
        }

        public Criteria andMonthRenewLike(String value) {
            addCriterion("WAHO_MONTH_RENEW like", value, "monthRenew");
            return (Criteria) this;
        }

        public Criteria andMonthRenewNotLike(String value) {
            addCriterion("WAHO_MONTH_RENEW not like", value, "monthRenew");
            return (Criteria) this;
        }

        public Criteria andMonthRenewIn(List<String> values) {
            addCriterion("WAHO_MONTH_RENEW in", values, "monthRenew");
            return (Criteria) this;
        }

        public Criteria andMonthRenewNotIn(List<String> values) {
            addCriterion("WAHO_MONTH_RENEW not in", values, "monthRenew");
            return (Criteria) this;
        }

        public Criteria andMonthRenewBetween(String value1, String value2) {
            addCriterion("WAHO_MONTH_RENEW between", value1, value2, "monthRenew");
            return (Criteria) this;
        }

        public Criteria andMonthRenewNotBetween(String value1, String value2) {
            addCriterion("WAHO_MONTH_RENEW not between", value1, value2, "monthRenew");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeIsNull() {
            addCriterion("WAHO_PROPERTY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeIsNotNull() {
            addCriterion("WAHO_PROPERTY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeEqualTo(String value) {
            addCriterion("WAHO_PROPERTY_TYPE =", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotEqualTo(String value) {
            addCriterion("WAHO_PROPERTY_TYPE <>", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeGreaterThan(String value) {
            addCriterion("WAHO_PROPERTY_TYPE >", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_PROPERTY_TYPE >=", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLessThan(String value) {
            addCriterion("WAHO_PROPERTY_TYPE <", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLessThanOrEqualTo(String value) {
            addCriterion("WAHO_PROPERTY_TYPE <=", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLike(String value) {
            addCriterion("WAHO_PROPERTY_TYPE like", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotLike(String value) {
            addCriterion("WAHO_PROPERTY_TYPE not like", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeIn(List<String> values) {
            addCriterion("WAHO_PROPERTY_TYPE in", values, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotIn(List<String> values) {
            addCriterion("WAHO_PROPERTY_TYPE not in", values, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeBetween(String value1, String value2) {
            addCriterion("WAHO_PROPERTY_TYPE between", value1, value2, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotBetween(String value1, String value2) {
            addCriterion("WAHO_PROPERTY_TYPE not between", value1, value2, "propertyType");
            return (Criteria) this;
        }

        public Criteria andImageQrcodeIsNull() {
            addCriterion("WAHO_IMAGEQRCODE is null");
            return (Criteria) this;
        }

        public Criteria andImageQrcodeIsNotNull() {
            addCriterion("WAHO_IMAGEQRCODE is not null");
            return (Criteria) this;
        }

        public Criteria andImageQrcodeEqualTo(String value) {
            addCriterion("WAHO_IMAGEQRCODE =", value, "imageQrcode");
            return (Criteria) this;
        }

        public Criteria andImageQrcodeNotEqualTo(String value) {
            addCriterion("WAHO_IMAGEQRCODE <>", value, "imageQrcode");
            return (Criteria) this;
        }

        public Criteria andImageQrcodeGreaterThan(String value) {
            addCriterion("WAHO_IMAGEQRCODE >", value, "imageQrcode");
            return (Criteria) this;
        }

        public Criteria andImageQrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGEQRCODE >=", value, "imageQrcode");
            return (Criteria) this;
        }

        public Criteria andImageQrcodeLessThan(String value) {
            addCriterion("WAHO_IMAGEQRCODE <", value, "imageQrcode");
            return (Criteria) this;
        }

        public Criteria andImageQrcodeLessThanOrEqualTo(String value) {
            addCriterion("WAHO_IMAGEQRCODE <=", value, "imageQrcode");
            return (Criteria) this;
        }

        public Criteria andImageQrcodeLike(String value) {
            addCriterion("WAHO_IMAGEQRCODE like", value, "imageQrcode");
            return (Criteria) this;
        }

        public Criteria andImageQrcodeNotLike(String value) {
            addCriterion("WAHO_IMAGEQRCODE not like", value, "imageQrcode");
            return (Criteria) this;
        }

        public Criteria andImageQrcodeIn(List<String> values) {
            addCriterion("WAHO_IMAGEQRCODE in", values, "imageQrcode");
            return (Criteria) this;
        }

        public Criteria andImageQrcodeNotIn(List<String> values) {
            addCriterion("WAHO_IMAGEQRCODE not in", values, "imageQrcode");
            return (Criteria) this;
        }

        public Criteria andImageQrcodeBetween(String value1, String value2) {
            addCriterion("WAHO_IMAGEQRCODE between", value1, value2, "imageQrcode");
            return (Criteria) this;
        }

        public Criteria andImageQrcodeNotBetween(String value1, String value2) {
            addCriterion("WAHO_IMAGEQRCODE not between", value1, value2, "imageQrcode");
            return (Criteria) this;
        }

        public Criteria andAdv3IsNull() {
            addCriterion("WAHO_ADV3 is null");
            return (Criteria) this;
        }

        public Criteria andAdv3IsNotNull() {
            addCriterion("WAHO_ADV3 is not null");
            return (Criteria) this;
        }

        public Criteria andAdv3EqualTo(String value) {
            addCriterion("WAHO_ADV3 =", value, "adv3");
            return (Criteria) this;
        }

        public Criteria andAdv3NotEqualTo(String value) {
            addCriterion("WAHO_ADV3 <>", value, "adv3");
            return (Criteria) this;
        }

        public Criteria andAdv3GreaterThan(String value) {
            addCriterion("WAHO_ADV3 >", value, "adv3");
            return (Criteria) this;
        }

        public Criteria andAdv3GreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_ADV3 >=", value, "adv3");
            return (Criteria) this;
        }

        public Criteria andAdv3LessThan(String value) {
            addCriterion("WAHO_ADV3 <", value, "adv3");
            return (Criteria) this;
        }

        public Criteria andAdv3LessThanOrEqualTo(String value) {
            addCriterion("WAHO_ADV3 <=", value, "adv3");
            return (Criteria) this;
        }

        public Criteria andAdv3Like(String value) {
            addCriterion("WAHO_ADV3 like", value, "adv3");
            return (Criteria) this;
        }

        public Criteria andAdv3NotLike(String value) {
            addCriterion("WAHO_ADV3 not like", value, "adv3");
            return (Criteria) this;
        }

        public Criteria andAdv3In(List<String> values) {
            addCriterion("WAHO_ADV3 in", values, "adv3");
            return (Criteria) this;
        }

        public Criteria andAdv3NotIn(List<String> values) {
            addCriterion("WAHO_ADV3 not in", values, "adv3");
            return (Criteria) this;
        }

        public Criteria andAdv3Between(String value1, String value2) {
            addCriterion("WAHO_ADV3 between", value1, value2, "adv3");
            return (Criteria) this;
        }

        public Criteria andAdv3NotBetween(String value1, String value2) {
            addCriterion("WAHO_ADV3 not between", value1, value2, "adv3");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumberIsNull() {
            addCriterion("WAHO_WECHATPUBLICNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumberIsNotNull() {
            addCriterion("WAHO_WECHATPUBLICNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumberEqualTo(String value) {
            addCriterion("WAHO_WECHATPUBLICNUMBER =", value, "wechatPublicNumber");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumberNotEqualTo(String value) {
            addCriterion("WAHO_WECHATPUBLICNUMBER <>", value, "wechatPublicNumber");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumberGreaterThan(String value) {
            addCriterion("WAHO_WECHATPUBLICNUMBER >", value, "wechatPublicNumber");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumberGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_WECHATPUBLICNUMBER >=", value, "wechatPublicNumber");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumberLessThan(String value) {
            addCriterion("WAHO_WECHATPUBLICNUMBER <", value, "wechatPublicNumber");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumberLessThanOrEqualTo(String value) {
            addCriterion("WAHO_WECHATPUBLICNUMBER <=", value, "wechatPublicNumber");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumberLike(String value) {
            addCriterion("WAHO_WECHATPUBLICNUMBER like", value, "wechatPublicNumber");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumberNotLike(String value) {
            addCriterion("WAHO_WECHATPUBLICNUMBER not like", value, "wechatPublicNumber");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumberIn(List<String> values) {
            addCriterion("WAHO_WECHATPUBLICNUMBER in", values, "wechatPublicNumber");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumberNotIn(List<String> values) {
            addCriterion("WAHO_WECHATPUBLICNUMBER not in", values, "wechatPublicNumber");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumberBetween(String value1, String value2) {
            addCriterion("WAHO_WECHATPUBLICNUMBER between", value1, value2, "wechatPublicNumber");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumberNotBetween(String value1, String value2) {
            addCriterion("WAHO_WECHATPUBLICNUMBER not between", value1, value2, "wechatPublicNumber");
            return (Criteria) this;
        }

        public Criteria andOnlineDateIsNull() {
            addCriterion("WAHO_ONLINE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOnlineDateIsNotNull() {
            addCriterion("WAHO_ONLINE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineDateEqualTo(String value) {
            addCriterion("WAHO_ONLINE_DATE =", value, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateNotEqualTo(String value) {
            addCriterion("WAHO_ONLINE_DATE <>", value, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateGreaterThan(String value) {
            addCriterion("WAHO_ONLINE_DATE >", value, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_ONLINE_DATE >=", value, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateLessThan(String value) {
            addCriterion("WAHO_ONLINE_DATE <", value, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateLessThanOrEqualTo(String value) {
            addCriterion("WAHO_ONLINE_DATE <=", value, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateLike(String value) {
            addCriterion("WAHO_ONLINE_DATE like", value, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateNotLike(String value) {
            addCriterion("WAHO_ONLINE_DATE not like", value, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateIn(List<String> values) {
            addCriterion("WAHO_ONLINE_DATE in", values, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateNotIn(List<String> values) {
            addCriterion("WAHO_ONLINE_DATE not in", values, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateBetween(String value1, String value2) {
            addCriterion("WAHO_ONLINE_DATE between", value1, value2, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateNotBetween(String value1, String value2) {
            addCriterion("WAHO_ONLINE_DATE not between", value1, value2, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andContactorIsNull() {
            addCriterion("WAHO_CONTACTOR is null");
            return (Criteria) this;
        }

        public Criteria andContactorIsNotNull() {
            addCriterion("WAHO_CONTACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andContactorEqualTo(String value) {
            addCriterion("WAHO_CONTACTOR =", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotEqualTo(String value) {
            addCriterion("WAHO_CONTACTOR <>", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorGreaterThan(String value) {
            addCriterion("WAHO_CONTACTOR >", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_CONTACTOR >=", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorLessThan(String value) {
            addCriterion("WAHO_CONTACTOR <", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorLessThanOrEqualTo(String value) {
            addCriterion("WAHO_CONTACTOR <=", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorLike(String value) {
            addCriterion("WAHO_CONTACTOR like", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotLike(String value) {
            addCriterion("WAHO_CONTACTOR not like", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorIn(List<String> values) {
            addCriterion("WAHO_CONTACTOR in", values, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotIn(List<String> values) {
            addCriterion("WAHO_CONTACTOR not in", values, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorBetween(String value1, String value2) {
            addCriterion("WAHO_CONTACTOR between", value1, value2, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotBetween(String value1, String value2) {
            addCriterion("WAHO_CONTACTOR not between", value1, value2, "contactor");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeIsNull() {
            addCriterion("WAHO_OPENING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeIsNotNull() {
            addCriterion("WAHO_OPENING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeEqualTo(String value) {
            addCriterion("WAHO_OPENING_TIME =", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeNotEqualTo(String value) {
            addCriterion("WAHO_OPENING_TIME <>", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeGreaterThan(String value) {
            addCriterion("WAHO_OPENING_TIME >", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_OPENING_TIME >=", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeLessThan(String value) {
            addCriterion("WAHO_OPENING_TIME <", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeLessThanOrEqualTo(String value) {
            addCriterion("WAHO_OPENING_TIME <=", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeLike(String value) {
            addCriterion("WAHO_OPENING_TIME like", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeNotLike(String value) {
            addCriterion("WAHO_OPENING_TIME not like", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeIn(List<String> values) {
            addCriterion("WAHO_OPENING_TIME in", values, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeNotIn(List<String> values) {
            addCriterion("WAHO_OPENING_TIME not in", values, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeBetween(String value1, String value2) {
            addCriterion("WAHO_OPENING_TIME between", value1, value2, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeNotBetween(String value1, String value2) {
            addCriterion("WAHO_OPENING_TIME not between", value1, value2, "openingTime");
            return (Criteria) this;
        }

        public Criteria andProjIdIsNull() {
            addCriterion("WAHO_PROJ_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjIdIsNotNull() {
            addCriterion("WAHO_PROJ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjIdEqualTo(String value) {
            addCriterion("WAHO_PROJ_ID =", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdNotEqualTo(String value) {
            addCriterion("WAHO_PROJ_ID <>", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdGreaterThan(String value) {
            addCriterion("WAHO_PROJ_ID >", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_PROJ_ID >=", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdLessThan(String value) {
            addCriterion("WAHO_PROJ_ID <", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdLessThanOrEqualTo(String value) {
            addCriterion("WAHO_PROJ_ID <=", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdLike(String value) {
            addCriterion("WAHO_PROJ_ID like", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdNotLike(String value) {
            addCriterion("WAHO_PROJ_ID not like", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdIn(List<String> values) {
            addCriterion("WAHO_PROJ_ID in", values, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdNotIn(List<String> values) {
            addCriterion("WAHO_PROJ_ID not in", values, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdBetween(String value1, String value2) {
            addCriterion("WAHO_PROJ_ID between", value1, value2, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdNotBetween(String value1, String value2) {
            addCriterion("WAHO_PROJ_ID not between", value1, value2, "projId");
            return (Criteria) this;
        }

        public Criteria andColsingTimeIsNull() {
            addCriterion("WAHO_COLSING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andColsingTimeIsNotNull() {
            addCriterion("WAHO_COLSING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andColsingTimeEqualTo(String value) {
            addCriterion("WAHO_COLSING_TIME =", value, "colsingTime");
            return (Criteria) this;
        }

        public Criteria andColsingTimeNotEqualTo(String value) {
            addCriterion("WAHO_COLSING_TIME <>", value, "colsingTime");
            return (Criteria) this;
        }

        public Criteria andColsingTimeGreaterThan(String value) {
            addCriterion("WAHO_COLSING_TIME >", value, "colsingTime");
            return (Criteria) this;
        }

        public Criteria andColsingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_COLSING_TIME >=", value, "colsingTime");
            return (Criteria) this;
        }

        public Criteria andColsingTimeLessThan(String value) {
            addCriterion("WAHO_COLSING_TIME <", value, "colsingTime");
            return (Criteria) this;
        }

        public Criteria andColsingTimeLessThanOrEqualTo(String value) {
            addCriterion("WAHO_COLSING_TIME <=", value, "colsingTime");
            return (Criteria) this;
        }

        public Criteria andColsingTimeLike(String value) {
            addCriterion("WAHO_COLSING_TIME like", value, "colsingTime");
            return (Criteria) this;
        }

        public Criteria andColsingTimeNotLike(String value) {
            addCriterion("WAHO_COLSING_TIME not like", value, "colsingTime");
            return (Criteria) this;
        }

        public Criteria andColsingTimeIn(List<String> values) {
            addCriterion("WAHO_COLSING_TIME in", values, "colsingTime");
            return (Criteria) this;
        }

        public Criteria andColsingTimeNotIn(List<String> values) {
            addCriterion("WAHO_COLSING_TIME not in", values, "colsingTime");
            return (Criteria) this;
        }

        public Criteria andColsingTimeBetween(String value1, String value2) {
            addCriterion("WAHO_COLSING_TIME between", value1, value2, "colsingTime");
            return (Criteria) this;
        }

        public Criteria andColsingTimeNotBetween(String value1, String value2) {
            addCriterion("WAHO_COLSING_TIME not between", value1, value2, "colsingTime");
            return (Criteria) this;
        }

        public Criteria andCabinetGroupIsNull() {
            addCriterion("WAHO_CABINET_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andCabinetGroupIsNotNull() {
            addCriterion("WAHO_CABINET_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetGroupEqualTo(String value) {
            addCriterion("WAHO_CABINET_GROUP =", value, "cabinetGroup");
            return (Criteria) this;
        }

        public Criteria andCabinetGroupNotEqualTo(String value) {
            addCriterion("WAHO_CABINET_GROUP <>", value, "cabinetGroup");
            return (Criteria) this;
        }

        public Criteria andCabinetGroupGreaterThan(String value) {
            addCriterion("WAHO_CABINET_GROUP >", value, "cabinetGroup");
            return (Criteria) this;
        }

        public Criteria andCabinetGroupGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_CABINET_GROUP >=", value, "cabinetGroup");
            return (Criteria) this;
        }

        public Criteria andCabinetGroupLessThan(String value) {
            addCriterion("WAHO_CABINET_GROUP <", value, "cabinetGroup");
            return (Criteria) this;
        }

        public Criteria andCabinetGroupLessThanOrEqualTo(String value) {
            addCriterion("WAHO_CABINET_GROUP <=", value, "cabinetGroup");
            return (Criteria) this;
        }

        public Criteria andCabinetGroupLike(String value) {
            addCriterion("WAHO_CABINET_GROUP like", value, "cabinetGroup");
            return (Criteria) this;
        }

        public Criteria andCabinetGroupNotLike(String value) {
            addCriterion("WAHO_CABINET_GROUP not like", value, "cabinetGroup");
            return (Criteria) this;
        }

        public Criteria andCabinetGroupIn(List<String> values) {
            addCriterion("WAHO_CABINET_GROUP in", values, "cabinetGroup");
            return (Criteria) this;
        }

        public Criteria andCabinetGroupNotIn(List<String> values) {
            addCriterion("WAHO_CABINET_GROUP not in", values, "cabinetGroup");
            return (Criteria) this;
        }

        public Criteria andCabinetGroupBetween(String value1, String value2) {
            addCriterion("WAHO_CABINET_GROUP between", value1, value2, "cabinetGroup");
            return (Criteria) this;
        }

        public Criteria andCabinetGroupNotBetween(String value1, String value2) {
            addCriterion("WAHO_CABINET_GROUP not between", value1, value2, "cabinetGroup");
            return (Criteria) this;
        }

        public Criteria andCabinetNumberIsNull() {
            addCriterion("WAHO_CABINET_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCabinetNumberIsNotNull() {
            addCriterion("WAHO_CABINET_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetNumberEqualTo(String value) {
            addCriterion("WAHO_CABINET_NUMBER =", value, "cabinetNumber");
            return (Criteria) this;
        }

        public Criteria andCabinetNumberNotEqualTo(String value) {
            addCriterion("WAHO_CABINET_NUMBER <>", value, "cabinetNumber");
            return (Criteria) this;
        }

        public Criteria andCabinetNumberGreaterThan(String value) {
            addCriterion("WAHO_CABINET_NUMBER >", value, "cabinetNumber");
            return (Criteria) this;
        }

        public Criteria andCabinetNumberGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_CABINET_NUMBER >=", value, "cabinetNumber");
            return (Criteria) this;
        }

        public Criteria andCabinetNumberLessThan(String value) {
            addCriterion("WAHO_CABINET_NUMBER <", value, "cabinetNumber");
            return (Criteria) this;
        }

        public Criteria andCabinetNumberLessThanOrEqualTo(String value) {
            addCriterion("WAHO_CABINET_NUMBER <=", value, "cabinetNumber");
            return (Criteria) this;
        }

        public Criteria andCabinetNumberLike(String value) {
            addCriterion("WAHO_CABINET_NUMBER like", value, "cabinetNumber");
            return (Criteria) this;
        }

        public Criteria andCabinetNumberNotLike(String value) {
            addCriterion("WAHO_CABINET_NUMBER not like", value, "cabinetNumber");
            return (Criteria) this;
        }

        public Criteria andCabinetNumberIn(List<String> values) {
            addCriterion("WAHO_CABINET_NUMBER in", values, "cabinetNumber");
            return (Criteria) this;
        }

        public Criteria andCabinetNumberNotIn(List<String> values) {
            addCriterion("WAHO_CABINET_NUMBER not in", values, "cabinetNumber");
            return (Criteria) this;
        }

        public Criteria andCabinetNumberBetween(String value1, String value2) {
            addCriterion("WAHO_CABINET_NUMBER between", value1, value2, "cabinetNumber");
            return (Criteria) this;
        }

        public Criteria andCabinetNumberNotBetween(String value1, String value2) {
            addCriterion("WAHO_CABINET_NUMBER not between", value1, value2, "cabinetNumber");
            return (Criteria) this;
        }

        public Criteria andBusineHoursIsNull() {
            addCriterion("WAHO_BUSINE_HOURS is null");
            return (Criteria) this;
        }

        public Criteria andBusineHoursIsNotNull() {
            addCriterion("WAHO_BUSINE_HOURS is not null");
            return (Criteria) this;
        }

        public Criteria andBusineHoursEqualTo(String value) {
            addCriterion("WAHO_BUSINE_HOURS =", value, "busineHours");
            return (Criteria) this;
        }

        public Criteria andBusineHoursNotEqualTo(String value) {
            addCriterion("WAHO_BUSINE_HOURS <>", value, "busineHours");
            return (Criteria) this;
        }

        public Criteria andBusineHoursGreaterThan(String value) {
            addCriterion("WAHO_BUSINE_HOURS >", value, "busineHours");
            return (Criteria) this;
        }

        public Criteria andBusineHoursGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_BUSINE_HOURS >=", value, "busineHours");
            return (Criteria) this;
        }

        public Criteria andBusineHoursLessThan(String value) {
            addCriterion("WAHO_BUSINE_HOURS <", value, "busineHours");
            return (Criteria) this;
        }

        public Criteria andBusineHoursLessThanOrEqualTo(String value) {
            addCriterion("WAHO_BUSINE_HOURS <=", value, "busineHours");
            return (Criteria) this;
        }

        public Criteria andBusineHoursLike(String value) {
            addCriterion("WAHO_BUSINE_HOURS like", value, "busineHours");
            return (Criteria) this;
        }

        public Criteria andBusineHoursNotLike(String value) {
            addCriterion("WAHO_BUSINE_HOURS not like", value, "busineHours");
            return (Criteria) this;
        }

        public Criteria andBusineHoursIn(List<String> values) {
            addCriterion("WAHO_BUSINE_HOURS in", values, "busineHours");
            return (Criteria) this;
        }

        public Criteria andBusineHoursNotIn(List<String> values) {
            addCriterion("WAHO_BUSINE_HOURS not in", values, "busineHours");
            return (Criteria) this;
        }

        public Criteria andBusineHoursBetween(String value1, String value2) {
            addCriterion("WAHO_BUSINE_HOURS between", value1, value2, "busineHours");
            return (Criteria) this;
        }

        public Criteria andBusineHoursNotBetween(String value1, String value2) {
            addCriterion("WAHO_BUSINE_HOURS not between", value1, value2, "busineHours");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("WAHO_IS_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("WAHO_IS_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(String value) {
            addCriterion("WAHO_IS_CHECK =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(String value) {
            addCriterion("WAHO_IS_CHECK <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(String value) {
            addCriterion("WAHO_IS_CHECK >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_IS_CHECK >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(String value) {
            addCriterion("WAHO_IS_CHECK <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(String value) {
            addCriterion("WAHO_IS_CHECK <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLike(String value) {
            addCriterion("WAHO_IS_CHECK like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotLike(String value) {
            addCriterion("WAHO_IS_CHECK not like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<String> values) {
            addCriterion("WAHO_IS_CHECK in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<String> values) {
            addCriterion("WAHO_IS_CHECK not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(String value1, String value2) {
            addCriterion("WAHO_IS_CHECK between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(String value1, String value2) {
            addCriterion("WAHO_IS_CHECK not between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlOldIsNull() {
            addCriterion("WAHO_QRCODE_URL_OLD is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlOldIsNotNull() {
            addCriterion("WAHO_QRCODE_URL_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlOldEqualTo(String value) {
            addCriterion("WAHO_QRCODE_URL_OLD =", value, "qrcodeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlOldNotEqualTo(String value) {
            addCriterion("WAHO_QRCODE_URL_OLD <>", value, "qrcodeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlOldGreaterThan(String value) {
            addCriterion("WAHO_QRCODE_URL_OLD >", value, "qrcodeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlOldGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_QRCODE_URL_OLD >=", value, "qrcodeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlOldLessThan(String value) {
            addCriterion("WAHO_QRCODE_URL_OLD <", value, "qrcodeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlOldLessThanOrEqualTo(String value) {
            addCriterion("WAHO_QRCODE_URL_OLD <=", value, "qrcodeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlOldLike(String value) {
            addCriterion("WAHO_QRCODE_URL_OLD like", value, "qrcodeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlOldNotLike(String value) {
            addCriterion("WAHO_QRCODE_URL_OLD not like", value, "qrcodeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlOldIn(List<String> values) {
            addCriterion("WAHO_QRCODE_URL_OLD in", values, "qrcodeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlOldNotIn(List<String> values) {
            addCriterion("WAHO_QRCODE_URL_OLD not in", values, "qrcodeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlOldBetween(String value1, String value2) {
            addCriterion("WAHO_QRCODE_URL_OLD between", value1, value2, "qrcodeUrlOld");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlOldNotBetween(String value1, String value2) {
            addCriterion("WAHO_QRCODE_URL_OLD not between", value1, value2, "qrcodeUrlOld");
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