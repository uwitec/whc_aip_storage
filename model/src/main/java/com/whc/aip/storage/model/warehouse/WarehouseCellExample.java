package com.whc.aip.storage.model.warehouse;

import java.util.ArrayList;
import java.util.List;

public class WarehouseCellExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseCellExample() {
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
            addCriterion("WAHOCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("WAHOCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("WAHOCE_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("WAHOCE_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("WAHOCE_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("WAHOCE_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("WAHOCE_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("WAHOCE_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("WAHOCE_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("WAHOCE_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("WAHOCE_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_ID not between", value1, value2, "id");
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

        public Criteria andNumberIsNull() {
            addCriterion("WAHOCE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("WAHOCE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("WAHOCE_NUMBER =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("WAHOCE_NUMBER <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("WAHOCE_NUMBER >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_NUMBER >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("WAHOCE_NUMBER <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_NUMBER <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("WAHOCE_NUMBER like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("WAHOCE_NUMBER not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("WAHOCE_NUMBER in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("WAHOCE_NUMBER not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("WAHOCE_NUMBER between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_NUMBER not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("WAHOCE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("WAHOCE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("WAHOCE_SIZE =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("WAHOCE_SIZE <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("WAHOCE_SIZE >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_SIZE >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("WAHOCE_SIZE <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_SIZE <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("WAHOCE_SIZE like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("WAHOCE_SIZE not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("WAHOCE_SIZE in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("WAHOCE_SIZE not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("WAHOCE_SIZE between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_SIZE not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andImage1IsNull() {
            addCriterion("WAHOCE_IMAGE1 is null");
            return (Criteria) this;
        }

        public Criteria andImage1IsNotNull() {
            addCriterion("WAHOCE_IMAGE1 is not null");
            return (Criteria) this;
        }

        public Criteria andImage1EqualTo(String value) {
            addCriterion("WAHOCE_IMAGE1 =", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotEqualTo(String value) {
            addCriterion("WAHOCE_IMAGE1 <>", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1GreaterThan(String value) {
            addCriterion("WAHOCE_IMAGE1 >", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1GreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_IMAGE1 >=", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1LessThan(String value) {
            addCriterion("WAHOCE_IMAGE1 <", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1LessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_IMAGE1 <=", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1Like(String value) {
            addCriterion("WAHOCE_IMAGE1 like", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotLike(String value) {
            addCriterion("WAHOCE_IMAGE1 not like", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1In(List<String> values) {
            addCriterion("WAHOCE_IMAGE1 in", values, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotIn(List<String> values) {
            addCriterion("WAHOCE_IMAGE1 not in", values, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1Between(String value1, String value2) {
            addCriterion("WAHOCE_IMAGE1 between", value1, value2, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotBetween(String value1, String value2) {
            addCriterion("WAHOCE_IMAGE1 not between", value1, value2, "image1");
            return (Criteria) this;
        }

        public Criteria andImage2IsNull() {
            addCriterion("WAHOCE_IMAGE2 is null");
            return (Criteria) this;
        }

        public Criteria andImage2IsNotNull() {
            addCriterion("WAHOCE_IMAGE2 is not null");
            return (Criteria) this;
        }

        public Criteria andImage2EqualTo(String value) {
            addCriterion("WAHOCE_IMAGE2 =", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotEqualTo(String value) {
            addCriterion("WAHOCE_IMAGE2 <>", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2GreaterThan(String value) {
            addCriterion("WAHOCE_IMAGE2 >", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2GreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_IMAGE2 >=", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2LessThan(String value) {
            addCriterion("WAHOCE_IMAGE2 <", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2LessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_IMAGE2 <=", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2Like(String value) {
            addCriterion("WAHOCE_IMAGE2 like", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotLike(String value) {
            addCriterion("WAHOCE_IMAGE2 not like", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2In(List<String> values) {
            addCriterion("WAHOCE_IMAGE2 in", values, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotIn(List<String> values) {
            addCriterion("WAHOCE_IMAGE2 not in", values, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2Between(String value1, String value2) {
            addCriterion("WAHOCE_IMAGE2 between", value1, value2, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotBetween(String value1, String value2) {
            addCriterion("WAHOCE_IMAGE2 not between", value1, value2, "image2");
            return (Criteria) this;
        }

        public Criteria andImage3IsNull() {
            addCriterion("WAHOCE_IMAGE3 is null");
            return (Criteria) this;
        }

        public Criteria andImage3IsNotNull() {
            addCriterion("WAHOCE_IMAGE3 is not null");
            return (Criteria) this;
        }

        public Criteria andImage3EqualTo(String value) {
            addCriterion("WAHOCE_IMAGE3 =", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotEqualTo(String value) {
            addCriterion("WAHOCE_IMAGE3 <>", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3GreaterThan(String value) {
            addCriterion("WAHOCE_IMAGE3 >", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3GreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_IMAGE3 >=", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3LessThan(String value) {
            addCriterion("WAHOCE_IMAGE3 <", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3LessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_IMAGE3 <=", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3Like(String value) {
            addCriterion("WAHOCE_IMAGE3 like", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotLike(String value) {
            addCriterion("WAHOCE_IMAGE3 not like", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3In(List<String> values) {
            addCriterion("WAHOCE_IMAGE3 in", values, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotIn(List<String> values) {
            addCriterion("WAHOCE_IMAGE3 not in", values, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3Between(String value1, String value2) {
            addCriterion("WAHOCE_IMAGE3 between", value1, value2, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotBetween(String value1, String value2) {
            addCriterion("WAHOCE_IMAGE3 not between", value1, value2, "image3");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("WAHOCE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("WAHOCE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("WAHOCE_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("WAHOCE_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("WAHOCE_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("WAHOCE_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("WAHOCE_STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("WAHOCE_STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("WAHOCE_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("WAHOCE_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("WAHOCE_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("WAHOCE_INTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("WAHOCE_INTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("WAHOCE_INTRODUCE =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("WAHOCE_INTRODUCE <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("WAHOCE_INTRODUCE >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_INTRODUCE >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("WAHOCE_INTRODUCE <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_INTRODUCE <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("WAHOCE_INTRODUCE like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("WAHOCE_INTRODUCE not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("WAHOCE_INTRODUCE in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("WAHOCE_INTRODUCE not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("WAHOCE_INTRODUCE between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_INTRODUCE not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("WAHOCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("WAHOCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("WAHOCE_TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("WAHOCE_TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("WAHOCE_TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("WAHOCE_TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("WAHOCE_TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("WAHOCE_TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("WAHOCE_TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("WAHOCE_TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("WAHOCE_TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("WAHOCE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("WAHOCE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("WAHOCE_PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("WAHOCE_PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("WAHOCE_PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("WAHOCE_PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("WAHOCE_PRICE like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("WAHOCE_PRICE not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("WAHOCE_PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("WAHOCE_PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("WAHOCE_PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("WAHOCE_DISCOUNT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("WAHOCE_DISCOUNT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(String value) {
            addCriterion("WAHOCE_DISCOUNT_PRICE =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(String value) {
            addCriterion("WAHOCE_DISCOUNT_PRICE <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(String value) {
            addCriterion("WAHOCE_DISCOUNT_PRICE >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_DISCOUNT_PRICE >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(String value) {
            addCriterion("WAHOCE_DISCOUNT_PRICE <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_DISCOUNT_PRICE <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLike(String value) {
            addCriterion("WAHOCE_DISCOUNT_PRICE like", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotLike(String value) {
            addCriterion("WAHOCE_DISCOUNT_PRICE not like", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<String> values) {
            addCriterion("WAHOCE_DISCOUNT_PRICE in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<String> values) {
            addCriterion("WAHOCE_DISCOUNT_PRICE not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(String value1, String value2) {
            addCriterion("WAHOCE_DISCOUNT_PRICE between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_DISCOUNT_PRICE not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDpriceIsNull() {
            addCriterion("WAHOCE_DPRICE is null");
            return (Criteria) this;
        }

        public Criteria andDpriceIsNotNull() {
            addCriterion("WAHOCE_DPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDpriceEqualTo(String value) {
            addCriterion("WAHOCE_DPRICE =", value, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceNotEqualTo(String value) {
            addCriterion("WAHOCE_DPRICE <>", value, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceGreaterThan(String value) {
            addCriterion("WAHOCE_DPRICE >", value, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_DPRICE >=", value, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceLessThan(String value) {
            addCriterion("WAHOCE_DPRICE <", value, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_DPRICE <=", value, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceLike(String value) {
            addCriterion("WAHOCE_DPRICE like", value, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceNotLike(String value) {
            addCriterion("WAHOCE_DPRICE not like", value, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceIn(List<String> values) {
            addCriterion("WAHOCE_DPRICE in", values, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceNotIn(List<String> values) {
            addCriterion("WAHOCE_DPRICE not in", values, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceBetween(String value1, String value2) {
            addCriterion("WAHOCE_DPRICE between", value1, value2, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_DPRICE not between", value1, value2, "dprice");
            return (Criteria) this;
        }

        public Criteria andDiscountDpriceIsNull() {
            addCriterion("WAHOCE_DISCOUNT_DPRICE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountDpriceIsNotNull() {
            addCriterion("WAHOCE_DISCOUNT_DPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountDpriceEqualTo(String value) {
            addCriterion("WAHOCE_DISCOUNT_DPRICE =", value, "discountDprice");
            return (Criteria) this;
        }

        public Criteria andDiscountDpriceNotEqualTo(String value) {
            addCriterion("WAHOCE_DISCOUNT_DPRICE <>", value, "discountDprice");
            return (Criteria) this;
        }

        public Criteria andDiscountDpriceGreaterThan(String value) {
            addCriterion("WAHOCE_DISCOUNT_DPRICE >", value, "discountDprice");
            return (Criteria) this;
        }

        public Criteria andDiscountDpriceGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_DISCOUNT_DPRICE >=", value, "discountDprice");
            return (Criteria) this;
        }

        public Criteria andDiscountDpriceLessThan(String value) {
            addCriterion("WAHOCE_DISCOUNT_DPRICE <", value, "discountDprice");
            return (Criteria) this;
        }

        public Criteria andDiscountDpriceLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_DISCOUNT_DPRICE <=", value, "discountDprice");
            return (Criteria) this;
        }

        public Criteria andDiscountDpriceLike(String value) {
            addCriterion("WAHOCE_DISCOUNT_DPRICE like", value, "discountDprice");
            return (Criteria) this;
        }

        public Criteria andDiscountDpriceNotLike(String value) {
            addCriterion("WAHOCE_DISCOUNT_DPRICE not like", value, "discountDprice");
            return (Criteria) this;
        }

        public Criteria andDiscountDpriceIn(List<String> values) {
            addCriterion("WAHOCE_DISCOUNT_DPRICE in", values, "discountDprice");
            return (Criteria) this;
        }

        public Criteria andDiscountDpriceNotIn(List<String> values) {
            addCriterion("WAHOCE_DISCOUNT_DPRICE not in", values, "discountDprice");
            return (Criteria) this;
        }

        public Criteria andDiscountDpriceBetween(String value1, String value2) {
            addCriterion("WAHOCE_DISCOUNT_DPRICE between", value1, value2, "discountDprice");
            return (Criteria) this;
        }

        public Criteria andDiscountDpriceNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_DISCOUNT_DPRICE not between", value1, value2, "discountDprice");
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

        public Criteria andKindIsNull() {
            addCriterion("WAHOCE_KIND is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("WAHOCE_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(String value) {
            addCriterion("WAHOCE_KIND =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(String value) {
            addCriterion("WAHOCE_KIND <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(String value) {
            addCriterion("WAHOCE_KIND >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_KIND >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(String value) {
            addCriterion("WAHOCE_KIND <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_KIND <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLike(String value) {
            addCriterion("WAHOCE_KIND like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotLike(String value) {
            addCriterion("WAHOCE_KIND not like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<String> values) {
            addCriterion("WAHOCE_KIND in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<String> values) {
            addCriterion("WAHOCE_KIND not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(String value1, String value2) {
            addCriterion("WAHOCE_KIND between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_KIND not between", value1, value2, "kind");
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