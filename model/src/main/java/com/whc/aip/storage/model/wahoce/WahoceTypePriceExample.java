package com.whc.aip.storage.model.wahoce;

import java.util.ArrayList;
import java.util.List;

public class WahoceTypePriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WahoceTypePriceExample() {
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
            addCriterion("WATYPR_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("WATYPR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("WATYPR_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("WATYPR_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("WATYPR_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("WATYPR_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("WATYPR_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("WATYPR_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("WATYPR_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("WATYPR_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("WATYPR_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("WATYPR_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("WATYPR_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("WATYPR_ID not between", value1, value2, "id");
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

        public Criteria andWatyIdIsNull() {
            addCriterion("WATY_ID is null");
            return (Criteria) this;
        }

        public Criteria andWatyIdIsNotNull() {
            addCriterion("WATY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWatyIdEqualTo(String value) {
            addCriterion("WATY_ID =", value, "watyId");
            return (Criteria) this;
        }

        public Criteria andWatyIdNotEqualTo(String value) {
            addCriterion("WATY_ID <>", value, "watyId");
            return (Criteria) this;
        }

        public Criteria andWatyIdGreaterThan(String value) {
            addCriterion("WATY_ID >", value, "watyId");
            return (Criteria) this;
        }

        public Criteria andWatyIdGreaterThanOrEqualTo(String value) {
            addCriterion("WATY_ID >=", value, "watyId");
            return (Criteria) this;
        }

        public Criteria andWatyIdLessThan(String value) {
            addCriterion("WATY_ID <", value, "watyId");
            return (Criteria) this;
        }

        public Criteria andWatyIdLessThanOrEqualTo(String value) {
            addCriterion("WATY_ID <=", value, "watyId");
            return (Criteria) this;
        }

        public Criteria andWatyIdLike(String value) {
            addCriterion("WATY_ID like", value, "watyId");
            return (Criteria) this;
        }

        public Criteria andWatyIdNotLike(String value) {
            addCriterion("WATY_ID not like", value, "watyId");
            return (Criteria) this;
        }

        public Criteria andWatyIdIn(List<String> values) {
            addCriterion("WATY_ID in", values, "watyId");
            return (Criteria) this;
        }

        public Criteria andWatyIdNotIn(List<String> values) {
            addCriterion("WATY_ID not in", values, "watyId");
            return (Criteria) this;
        }

        public Criteria andWatyIdBetween(String value1, String value2) {
            addCriterion("WATY_ID between", value1, value2, "watyId");
            return (Criteria) this;
        }

        public Criteria andWatyIdNotBetween(String value1, String value2) {
            addCriterion("WATY_ID not between", value1, value2, "watyId");
            return (Criteria) this;
        }

        public Criteria andMonthPriceIsNull() {
            addCriterion("WATYPR_MONTH_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andMonthPriceIsNotNull() {
            addCriterion("WATYPR_MONTH_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMonthPriceEqualTo(String value) {
            addCriterion("WATYPR_MONTH_PRICE =", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceNotEqualTo(String value) {
            addCriterion("WATYPR_MONTH_PRICE <>", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceGreaterThan(String value) {
            addCriterion("WATYPR_MONTH_PRICE >", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WATYPR_MONTH_PRICE >=", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceLessThan(String value) {
            addCriterion("WATYPR_MONTH_PRICE <", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceLessThanOrEqualTo(String value) {
            addCriterion("WATYPR_MONTH_PRICE <=", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceLike(String value) {
            addCriterion("WATYPR_MONTH_PRICE like", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceNotLike(String value) {
            addCriterion("WATYPR_MONTH_PRICE not like", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceIn(List<String> values) {
            addCriterion("WATYPR_MONTH_PRICE in", values, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceNotIn(List<String> values) {
            addCriterion("WATYPR_MONTH_PRICE not in", values, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceBetween(String value1, String value2) {
            addCriterion("WATYPR_MONTH_PRICE between", value1, value2, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceNotBetween(String value1, String value2) {
            addCriterion("WATYPR_MONTH_PRICE not between", value1, value2, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceIsNull() {
            addCriterion("WATYPR_DAY_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andDayPriceIsNotNull() {
            addCriterion("WATYPR_DAY_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDayPriceEqualTo(String value) {
            addCriterion("WATYPR_DAY_PRICE =", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceNotEqualTo(String value) {
            addCriterion("WATYPR_DAY_PRICE <>", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceGreaterThan(String value) {
            addCriterion("WATYPR_DAY_PRICE >", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WATYPR_DAY_PRICE >=", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceLessThan(String value) {
            addCriterion("WATYPR_DAY_PRICE <", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceLessThanOrEqualTo(String value) {
            addCriterion("WATYPR_DAY_PRICE <=", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceLike(String value) {
            addCriterion("WATYPR_DAY_PRICE like", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceNotLike(String value) {
            addCriterion("WATYPR_DAY_PRICE not like", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceIn(List<String> values) {
            addCriterion("WATYPR_DAY_PRICE in", values, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceNotIn(List<String> values) {
            addCriterion("WATYPR_DAY_PRICE not in", values, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceBetween(String value1, String value2) {
            addCriterion("WATYPR_DAY_PRICE between", value1, value2, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceNotBetween(String value1, String value2) {
            addCriterion("WATYPR_DAY_PRICE not between", value1, value2, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andHalfPriceIsNull() {
            addCriterion("WATYPR_HALF_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andHalfPriceIsNotNull() {
            addCriterion("WATYPR_HALF_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andHalfPriceEqualTo(String value) {
            addCriterion("WATYPR_HALF_PRICE =", value, "halfPrice");
            return (Criteria) this;
        }

        public Criteria andHalfPriceNotEqualTo(String value) {
            addCriterion("WATYPR_HALF_PRICE <>", value, "halfPrice");
            return (Criteria) this;
        }

        public Criteria andHalfPriceGreaterThan(String value) {
            addCriterion("WATYPR_HALF_PRICE >", value, "halfPrice");
            return (Criteria) this;
        }

        public Criteria andHalfPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WATYPR_HALF_PRICE >=", value, "halfPrice");
            return (Criteria) this;
        }

        public Criteria andHalfPriceLessThan(String value) {
            addCriterion("WATYPR_HALF_PRICE <", value, "halfPrice");
            return (Criteria) this;
        }

        public Criteria andHalfPriceLessThanOrEqualTo(String value) {
            addCriterion("WATYPR_HALF_PRICE <=", value, "halfPrice");
            return (Criteria) this;
        }

        public Criteria andHalfPriceLike(String value) {
            addCriterion("WATYPR_HALF_PRICE like", value, "halfPrice");
            return (Criteria) this;
        }

        public Criteria andHalfPriceNotLike(String value) {
            addCriterion("WATYPR_HALF_PRICE not like", value, "halfPrice");
            return (Criteria) this;
        }

        public Criteria andHalfPriceIn(List<String> values) {
            addCriterion("WATYPR_HALF_PRICE in", values, "halfPrice");
            return (Criteria) this;
        }

        public Criteria andHalfPriceNotIn(List<String> values) {
            addCriterion("WATYPR_HALF_PRICE not in", values, "halfPrice");
            return (Criteria) this;
        }

        public Criteria andHalfPriceBetween(String value1, String value2) {
            addCriterion("WATYPR_HALF_PRICE between", value1, value2, "halfPrice");
            return (Criteria) this;
        }

        public Criteria andHalfPriceNotBetween(String value1, String value2) {
            addCriterion("WATYPR_HALF_PRICE not between", value1, value2, "halfPrice");
            return (Criteria) this;
        }

        public Criteria andYearPriceIsNull() {
            addCriterion("WATYPR_YEAR_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andYearPriceIsNotNull() {
            addCriterion("WATYPR_YEAR_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andYearPriceEqualTo(String value) {
            addCriterion("WATYPR_YEAR_PRICE =", value, "yearPrice");
            return (Criteria) this;
        }

        public Criteria andYearPriceNotEqualTo(String value) {
            addCriterion("WATYPR_YEAR_PRICE <>", value, "yearPrice");
            return (Criteria) this;
        }

        public Criteria andYearPriceGreaterThan(String value) {
            addCriterion("WATYPR_YEAR_PRICE >", value, "yearPrice");
            return (Criteria) this;
        }

        public Criteria andYearPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WATYPR_YEAR_PRICE >=", value, "yearPrice");
            return (Criteria) this;
        }

        public Criteria andYearPriceLessThan(String value) {
            addCriterion("WATYPR_YEAR_PRICE <", value, "yearPrice");
            return (Criteria) this;
        }

        public Criteria andYearPriceLessThanOrEqualTo(String value) {
            addCriterion("WATYPR_YEAR_PRICE <=", value, "yearPrice");
            return (Criteria) this;
        }

        public Criteria andYearPriceLike(String value) {
            addCriterion("WATYPR_YEAR_PRICE like", value, "yearPrice");
            return (Criteria) this;
        }

        public Criteria andYearPriceNotLike(String value) {
            addCriterion("WATYPR_YEAR_PRICE not like", value, "yearPrice");
            return (Criteria) this;
        }

        public Criteria andYearPriceIn(List<String> values) {
            addCriterion("WATYPR_YEAR_PRICE in", values, "yearPrice");
            return (Criteria) this;
        }

        public Criteria andYearPriceNotIn(List<String> values) {
            addCriterion("WATYPR_YEAR_PRICE not in", values, "yearPrice");
            return (Criteria) this;
        }

        public Criteria andYearPriceBetween(String value1, String value2) {
            addCriterion("WATYPR_YEAR_PRICE between", value1, value2, "yearPrice");
            return (Criteria) this;
        }

        public Criteria andYearPriceNotBetween(String value1, String value2) {
            addCriterion("WATYPR_YEAR_PRICE not between", value1, value2, "yearPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceIsNull() {
            addCriterion("WATYPR_SPECIAL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceIsNotNull() {
            addCriterion("WATYPR_SPECIAL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceEqualTo(String value) {
            addCriterion("WATYPR_SPECIAL_PRICE =", value, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceNotEqualTo(String value) {
            addCriterion("WATYPR_SPECIAL_PRICE <>", value, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceGreaterThan(String value) {
            addCriterion("WATYPR_SPECIAL_PRICE >", value, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WATYPR_SPECIAL_PRICE >=", value, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceLessThan(String value) {
            addCriterion("WATYPR_SPECIAL_PRICE <", value, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceLessThanOrEqualTo(String value) {
            addCriterion("WATYPR_SPECIAL_PRICE <=", value, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceLike(String value) {
            addCriterion("WATYPR_SPECIAL_PRICE like", value, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceNotLike(String value) {
            addCriterion("WATYPR_SPECIAL_PRICE not like", value, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceIn(List<String> values) {
            addCriterion("WATYPR_SPECIAL_PRICE in", values, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceNotIn(List<String> values) {
            addCriterion("WATYPR_SPECIAL_PRICE not in", values, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceBetween(String value1, String value2) {
            addCriterion("WATYPR_SPECIAL_PRICE between", value1, value2, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecialPriceNotBetween(String value1, String value2) {
            addCriterion("WATYPR_SPECIAL_PRICE not between", value1, value2, "specialPrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceIsNull() {
            addCriterion("WATYPR_TIME_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andTimePriceIsNotNull() {
            addCriterion("WATYPR_TIME_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andTimePriceEqualTo(String value) {
            addCriterion("WATYPR_TIME_PRICE =", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceNotEqualTo(String value) {
            addCriterion("WATYPR_TIME_PRICE <>", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceGreaterThan(String value) {
            addCriterion("WATYPR_TIME_PRICE >", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceGreaterThanOrEqualTo(String value) {
            addCriterion("WATYPR_TIME_PRICE >=", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceLessThan(String value) {
            addCriterion("WATYPR_TIME_PRICE <", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceLessThanOrEqualTo(String value) {
            addCriterion("WATYPR_TIME_PRICE <=", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceLike(String value) {
            addCriterion("WATYPR_TIME_PRICE like", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceNotLike(String value) {
            addCriterion("WATYPR_TIME_PRICE not like", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceIn(List<String> values) {
            addCriterion("WATYPR_TIME_PRICE in", values, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceNotIn(List<String> values) {
            addCriterion("WATYPR_TIME_PRICE not in", values, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceBetween(String value1, String value2) {
            addCriterion("WATYPR_TIME_PRICE between", value1, value2, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceNotBetween(String value1, String value2) {
            addCriterion("WATYPR_TIME_PRICE not between", value1, value2, "timePrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceIsNull() {
            addCriterion("WATYPR_DEPOSIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andDepositPriceIsNotNull() {
            addCriterion("WATYPR_DEPOSIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDepositPriceEqualTo(String value) {
            addCriterion("WATYPR_DEPOSIT_PRICE =", value, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceNotEqualTo(String value) {
            addCriterion("WATYPR_DEPOSIT_PRICE <>", value, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceGreaterThan(String value) {
            addCriterion("WATYPR_DEPOSIT_PRICE >", value, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceGreaterThanOrEqualTo(String value) {
            addCriterion("WATYPR_DEPOSIT_PRICE >=", value, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceLessThan(String value) {
            addCriterion("WATYPR_DEPOSIT_PRICE <", value, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceLessThanOrEqualTo(String value) {
            addCriterion("WATYPR_DEPOSIT_PRICE <=", value, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceLike(String value) {
            addCriterion("WATYPR_DEPOSIT_PRICE like", value, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceNotLike(String value) {
            addCriterion("WATYPR_DEPOSIT_PRICE not like", value, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceIn(List<String> values) {
            addCriterion("WATYPR_DEPOSIT_PRICE in", values, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceNotIn(List<String> values) {
            addCriterion("WATYPR_DEPOSIT_PRICE not in", values, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceBetween(String value1, String value2) {
            addCriterion("WATYPR_DEPOSIT_PRICE between", value1, value2, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceNotBetween(String value1, String value2) {
            addCriterion("WATYPR_DEPOSIT_PRICE not between", value1, value2, "depositPrice");
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