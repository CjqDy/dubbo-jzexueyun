package com.orange.entity.authcenter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MenuButtonMapExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public MenuButtonMapExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andButtonNameIsNull() {
            addCriterion("button_name is null");
            return (Criteria) this;
        }

        public Criteria andButtonNameIsNotNull() {
            addCriterion("button_name is not null");
            return (Criteria) this;
        }

        public Criteria andButtonNameEqualTo(String value) {
            addCriterion("button_name =", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameNotEqualTo(String value) {
            addCriterion("button_name <>", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameGreaterThan(String value) {
            addCriterion("button_name >", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameGreaterThanOrEqualTo(String value) {
            addCriterion("button_name >=", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameLessThan(String value) {
            addCriterion("button_name <", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameLessThanOrEqualTo(String value) {
            addCriterion("button_name <=", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameLike(String value) {
            addCriterion("button_name like", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameNotLike(String value) {
            addCriterion("button_name not like", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameIn(List<String> values) {
            addCriterion("button_name in", values, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameNotIn(List<String> values) {
            addCriterion("button_name not in", values, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameBetween(String value1, String value2) {
            addCriterion("button_name between", value1, value2, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameNotBetween(String value1, String value2) {
            addCriterion("button_name not between", value1, value2, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonDescIsNull() {
            addCriterion("button_desc is null");
            return (Criteria) this;
        }

        public Criteria andButtonDescIsNotNull() {
            addCriterion("button_desc is not null");
            return (Criteria) this;
        }

        public Criteria andButtonDescEqualTo(String value) {
            addCriterion("button_desc =", value, "buttonDesc");
            return (Criteria) this;
        }

        public Criteria andButtonDescNotEqualTo(String value) {
            addCriterion("button_desc <>", value, "buttonDesc");
            return (Criteria) this;
        }

        public Criteria andButtonDescGreaterThan(String value) {
            addCriterion("button_desc >", value, "buttonDesc");
            return (Criteria) this;
        }

        public Criteria andButtonDescGreaterThanOrEqualTo(String value) {
            addCriterion("button_desc >=", value, "buttonDesc");
            return (Criteria) this;
        }

        public Criteria andButtonDescLessThan(String value) {
            addCriterion("button_desc <", value, "buttonDesc");
            return (Criteria) this;
        }

        public Criteria andButtonDescLessThanOrEqualTo(String value) {
            addCriterion("button_desc <=", value, "buttonDesc");
            return (Criteria) this;
        }

        public Criteria andButtonDescLike(String value) {
            addCriterion("button_desc like", value, "buttonDesc");
            return (Criteria) this;
        }

        public Criteria andButtonDescNotLike(String value) {
            addCriterion("button_desc not like", value, "buttonDesc");
            return (Criteria) this;
        }

        public Criteria andButtonDescIn(List<String> values) {
            addCriterion("button_desc in", values, "buttonDesc");
            return (Criteria) this;
        }

        public Criteria andButtonDescNotIn(List<String> values) {
            addCriterion("button_desc not in", values, "buttonDesc");
            return (Criteria) this;
        }

        public Criteria andButtonDescBetween(String value1, String value2) {
            addCriterion("button_desc between", value1, value2, "buttonDesc");
            return (Criteria) this;
        }

        public Criteria andButtonDescNotBetween(String value1, String value2) {
            addCriterion("button_desc not between", value1, value2, "buttonDesc");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("menu_id like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("menu_id not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andAllowShareIsNull() {
            addCriterion("allow_share is null");
            return (Criteria) this;
        }

        public Criteria andAllowShareIsNotNull() {
            addCriterion("allow_share is not null");
            return (Criteria) this;
        }

        public Criteria andAllowShareEqualTo(String value) {
            addCriterion("allow_share =", value, "allowShare");
            return (Criteria) this;
        }

        public Criteria andAllowShareNotEqualTo(String value) {
            addCriterion("allow_share <>", value, "allowShare");
            return (Criteria) this;
        }

        public Criteria andAllowShareGreaterThan(String value) {
            addCriterion("allow_share >", value, "allowShare");
            return (Criteria) this;
        }

        public Criteria andAllowShareGreaterThanOrEqualTo(String value) {
            addCriterion("allow_share >=", value, "allowShare");
            return (Criteria) this;
        }

        public Criteria andAllowShareLessThan(String value) {
            addCriterion("allow_share <", value, "allowShare");
            return (Criteria) this;
        }

        public Criteria andAllowShareLessThanOrEqualTo(String value) {
            addCriterion("allow_share <=", value, "allowShare");
            return (Criteria) this;
        }

        public Criteria andAllowShareLike(String value) {
            addCriterion("allow_share like", value, "allowShare");
            return (Criteria) this;
        }

        public Criteria andAllowShareNotLike(String value) {
            addCriterion("allow_share not like", value, "allowShare");
            return (Criteria) this;
        }

        public Criteria andAllowShareIn(List<String> values) {
            addCriterion("allow_share in", values, "allowShare");
            return (Criteria) this;
        }

        public Criteria andAllowShareNotIn(List<String> values) {
            addCriterion("allow_share not in", values, "allowShare");
            return (Criteria) this;
        }

        public Criteria andAllowShareBetween(String value1, String value2) {
            addCriterion("allow_share between", value1, value2, "allowShare");
            return (Criteria) this;
        }

        public Criteria andAllowShareNotBetween(String value1, String value2) {
            addCriterion("allow_share not between", value1, value2, "allowShare");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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