package com.answer.server.model;

import java.util.ArrayList;
import java.util.List;

public class DescExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DescExample() {
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

        public Criteria andDescIdIsNull() {
            addCriterion("desc_id is null");
            return (Criteria) this;
        }

        public Criteria andDescIdIsNotNull() {
            addCriterion("desc_id is not null");
            return (Criteria) this;
        }

        public Criteria andDescIdEqualTo(Integer value) {
            addCriterion("desc_id =", value, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdNotEqualTo(Integer value) {
            addCriterion("desc_id <>", value, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdGreaterThan(Integer value) {
            addCriterion("desc_id >", value, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("desc_id >=", value, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdLessThan(Integer value) {
            addCriterion("desc_id <", value, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdLessThanOrEqualTo(Integer value) {
            addCriterion("desc_id <=", value, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdIn(List<Integer> values) {
            addCriterion("desc_id in", values, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdNotIn(List<Integer> values) {
            addCriterion("desc_id not in", values, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdBetween(Integer value1, Integer value2) {
            addCriterion("desc_id between", value1, value2, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdNotBetween(Integer value1, Integer value2) {
            addCriterion("desc_id not between", value1, value2, "descId");
            return (Criteria) this;
        }

        public Criteria andProdServiceIsNull() {
            addCriterion("prod_service is null");
            return (Criteria) this;
        }

        public Criteria andProdServiceIsNotNull() {
            addCriterion("prod_service is not null");
            return (Criteria) this;
        }

        public Criteria andProdServiceEqualTo(String value) {
            addCriterion("prod_service =", value, "prodService");
            return (Criteria) this;
        }

        public Criteria andProdServiceNotEqualTo(String value) {
            addCriterion("prod_service <>", value, "prodService");
            return (Criteria) this;
        }

        public Criteria andProdServiceGreaterThan(String value) {
            addCriterion("prod_service >", value, "prodService");
            return (Criteria) this;
        }

        public Criteria andProdServiceGreaterThanOrEqualTo(String value) {
            addCriterion("prod_service >=", value, "prodService");
            return (Criteria) this;
        }

        public Criteria andProdServiceLessThan(String value) {
            addCriterion("prod_service <", value, "prodService");
            return (Criteria) this;
        }

        public Criteria andProdServiceLessThanOrEqualTo(String value) {
            addCriterion("prod_service <=", value, "prodService");
            return (Criteria) this;
        }

        public Criteria andProdServiceLike(String value) {
            addCriterion("prod_service like", value, "prodService");
            return (Criteria) this;
        }

        public Criteria andProdServiceNotLike(String value) {
            addCriterion("prod_service not like", value, "prodService");
            return (Criteria) this;
        }

        public Criteria andProdServiceIn(List<String> values) {
            addCriterion("prod_service in", values, "prodService");
            return (Criteria) this;
        }

        public Criteria andProdServiceNotIn(List<String> values) {
            addCriterion("prod_service not in", values, "prodService");
            return (Criteria) this;
        }

        public Criteria andProdServiceBetween(String value1, String value2) {
            addCriterion("prod_service between", value1, value2, "prodService");
            return (Criteria) this;
        }

        public Criteria andProdServiceNotBetween(String value1, String value2) {
            addCriterion("prod_service not between", value1, value2, "prodService");
            return (Criteria) this;
        }

        public Criteria andProdCommentIsNull() {
            addCriterion("prod_comment is null");
            return (Criteria) this;
        }

        public Criteria andProdCommentIsNotNull() {
            addCriterion("prod_comment is not null");
            return (Criteria) this;
        }

        public Criteria andProdCommentEqualTo(String value) {
            addCriterion("prod_comment =", value, "prodComment");
            return (Criteria) this;
        }

        public Criteria andProdCommentNotEqualTo(String value) {
            addCriterion("prod_comment <>", value, "prodComment");
            return (Criteria) this;
        }

        public Criteria andProdCommentGreaterThan(String value) {
            addCriterion("prod_comment >", value, "prodComment");
            return (Criteria) this;
        }

        public Criteria andProdCommentGreaterThanOrEqualTo(String value) {
            addCriterion("prod_comment >=", value, "prodComment");
            return (Criteria) this;
        }

        public Criteria andProdCommentLessThan(String value) {
            addCriterion("prod_comment <", value, "prodComment");
            return (Criteria) this;
        }

        public Criteria andProdCommentLessThanOrEqualTo(String value) {
            addCriterion("prod_comment <=", value, "prodComment");
            return (Criteria) this;
        }

        public Criteria andProdCommentLike(String value) {
            addCriterion("prod_comment like", value, "prodComment");
            return (Criteria) this;
        }

        public Criteria andProdCommentNotLike(String value) {
            addCriterion("prod_comment not like", value, "prodComment");
            return (Criteria) this;
        }

        public Criteria andProdCommentIn(List<String> values) {
            addCriterion("prod_comment in", values, "prodComment");
            return (Criteria) this;
        }

        public Criteria andProdCommentNotIn(List<String> values) {
            addCriterion("prod_comment not in", values, "prodComment");
            return (Criteria) this;
        }

        public Criteria andProdCommentBetween(String value1, String value2) {
            addCriterion("prod_comment between", value1, value2, "prodComment");
            return (Criteria) this;
        }

        public Criteria andProdCommentNotBetween(String value1, String value2) {
            addCriterion("prod_comment not between", value1, value2, "prodComment");
            return (Criteria) this;
        }

        public Criteria andImgSrcIsNull() {
            addCriterion("img_src is null");
            return (Criteria) this;
        }

        public Criteria andImgSrcIsNotNull() {
            addCriterion("img_src is not null");
            return (Criteria) this;
        }

        public Criteria andImgSrcEqualTo(String value) {
            addCriterion("img_src =", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcNotEqualTo(String value) {
            addCriterion("img_src <>", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcGreaterThan(String value) {
            addCriterion("img_src >", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcGreaterThanOrEqualTo(String value) {
            addCriterion("img_src >=", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcLessThan(String value) {
            addCriterion("img_src <", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcLessThanOrEqualTo(String value) {
            addCriterion("img_src <=", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcLike(String value) {
            addCriterion("img_src like", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcNotLike(String value) {
            addCriterion("img_src not like", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcIn(List<String> values) {
            addCriterion("img_src in", values, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcNotIn(List<String> values) {
            addCriterion("img_src not in", values, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcBetween(String value1, String value2) {
            addCriterion("img_src between", value1, value2, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcNotBetween(String value1, String value2) {
            addCriterion("img_src not between", value1, value2, "imgSrc");
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