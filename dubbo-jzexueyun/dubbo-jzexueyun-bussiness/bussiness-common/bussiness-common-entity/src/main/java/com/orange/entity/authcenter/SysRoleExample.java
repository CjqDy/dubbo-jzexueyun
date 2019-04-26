package com.orange.entity.authcenter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysRoleExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SysRoleExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(String value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(String value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(String value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(String value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(String value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(String value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLike(String value) {
            addCriterion("p_id like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotLike(String value) {
            addCriterion("p_id not like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<String> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<String> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(String value1, String value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(String value1, String value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andFSystemIdIsNull() {
            addCriterion("f_system_id is null");
            return (Criteria) this;
        }

        public Criteria andFSystemIdIsNotNull() {
            addCriterion("f_system_id is not null");
            return (Criteria) this;
        }

        public Criteria andFSystemIdEqualTo(String value) {
            addCriterion("f_system_id =", value, "fSystemId");
            return (Criteria) this;
        }

        public Criteria andFSystemIdNotEqualTo(String value) {
            addCriterion("f_system_id <>", value, "fSystemId");
            return (Criteria) this;
        }

        public Criteria andFSystemIdGreaterThan(String value) {
            addCriterion("f_system_id >", value, "fSystemId");
            return (Criteria) this;
        }

        public Criteria andFSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("f_system_id >=", value, "fSystemId");
            return (Criteria) this;
        }

        public Criteria andFSystemIdLessThan(String value) {
            addCriterion("f_system_id <", value, "fSystemId");
            return (Criteria) this;
        }

        public Criteria andFSystemIdLessThanOrEqualTo(String value) {
            addCriterion("f_system_id <=", value, "fSystemId");
            return (Criteria) this;
        }

        public Criteria andFSystemIdLike(String value) {
            addCriterion("f_system_id like", value, "fSystemId");
            return (Criteria) this;
        }

        public Criteria andFSystemIdNotLike(String value) {
            addCriterion("f_system_id not like", value, "fSystemId");
            return (Criteria) this;
        }

        public Criteria andFSystemIdIn(List<String> values) {
            addCriterion("f_system_id in", values, "fSystemId");
            return (Criteria) this;
        }

        public Criteria andFSystemIdNotIn(List<String> values) {
            addCriterion("f_system_id not in", values, "fSystemId");
            return (Criteria) this;
        }

        public Criteria andFSystemIdBetween(String value1, String value2) {
            addCriterion("f_system_id between", value1, value2, "fSystemId");
            return (Criteria) this;
        }

        public Criteria andFSystemIdNotBetween(String value1, String value2) {
            addCriterion("f_system_id not between", value1, value2, "fSystemId");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSDescIsNull() {
            addCriterion("s_desc is null");
            return (Criteria) this;
        }

        public Criteria andSDescIsNotNull() {
            addCriterion("s_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSDescEqualTo(String value) {
            addCriterion("s_desc =", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotEqualTo(String value) {
            addCriterion("s_desc <>", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescGreaterThan(String value) {
            addCriterion("s_desc >", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescGreaterThanOrEqualTo(String value) {
            addCriterion("s_desc >=", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescLessThan(String value) {
            addCriterion("s_desc <", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescLessThanOrEqualTo(String value) {
            addCriterion("s_desc <=", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescLike(String value) {
            addCriterion("s_desc like", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotLike(String value) {
            addCriterion("s_desc not like", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescIn(List<String> values) {
            addCriterion("s_desc in", values, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotIn(List<String> values) {
            addCriterion("s_desc not in", values, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescBetween(String value1, String value2) {
            addCriterion("s_desc between", value1, value2, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotBetween(String value1, String value2) {
            addCriterion("s_desc not between", value1, value2, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSTypeIsNull() {
            addCriterion("s_type is null");
            return (Criteria) this;
        }

        public Criteria andSTypeIsNotNull() {
            addCriterion("s_type is not null");
            return (Criteria) this;
        }

        public Criteria andSTypeEqualTo(String value) {
            addCriterion("s_type =", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotEqualTo(String value) {
            addCriterion("s_type <>", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeGreaterThan(String value) {
            addCriterion("s_type >", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeGreaterThanOrEqualTo(String value) {
            addCriterion("s_type >=", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeLessThan(String value) {
            addCriterion("s_type <", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeLessThanOrEqualTo(String value) {
            addCriterion("s_type <=", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeLike(String value) {
            addCriterion("s_type like", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotLike(String value) {
            addCriterion("s_type not like", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeIn(List<String> values) {
            addCriterion("s_type in", values, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotIn(List<String> values) {
            addCriterion("s_type not in", values, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeBetween(String value1, String value2) {
            addCriterion("s_type between", value1, value2, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotBetween(String value1, String value2) {
            addCriterion("s_type not between", value1, value2, "sType");
            return (Criteria) this;
        }

        public Criteria andSCreatorIsNull() {
            addCriterion("s_creator is null");
            return (Criteria) this;
        }

        public Criteria andSCreatorIsNotNull() {
            addCriterion("s_creator is not null");
            return (Criteria) this;
        }

        public Criteria andSCreatorEqualTo(String value) {
            addCriterion("s_creator =", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorNotEqualTo(String value) {
            addCriterion("s_creator <>", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorGreaterThan(String value) {
            addCriterion("s_creator >", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("s_creator >=", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorLessThan(String value) {
            addCriterion("s_creator <", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorLessThanOrEqualTo(String value) {
            addCriterion("s_creator <=", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorLike(String value) {
            addCriterion("s_creator like", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorNotLike(String value) {
            addCriterion("s_creator not like", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorIn(List<String> values) {
            addCriterion("s_creator in", values, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorNotIn(List<String> values) {
            addCriterion("s_creator not in", values, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorBetween(String value1, String value2) {
            addCriterion("s_creator between", value1, value2, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorNotBetween(String value1, String value2) {
            addCriterion("s_creator not between", value1, value2, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreaterTimeIsNull() {
            addCriterion("s_creater_time is null");
            return (Criteria) this;
        }

        public Criteria andSCreaterTimeIsNotNull() {
            addCriterion("s_creater_time is not null");
            return (Criteria) this;
        }

        public Criteria andSCreaterTimeEqualTo(Date value) {
            addCriterion("s_creater_time =", value, "sCreaterTime");
            return (Criteria) this;
        }

        public Criteria andSCreaterTimeNotEqualTo(Date value) {
            addCriterion("s_creater_time <>", value, "sCreaterTime");
            return (Criteria) this;
        }

        public Criteria andSCreaterTimeGreaterThan(Date value) {
            addCriterion("s_creater_time >", value, "sCreaterTime");
            return (Criteria) this;
        }

        public Criteria andSCreaterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("s_creater_time >=", value, "sCreaterTime");
            return (Criteria) this;
        }

        public Criteria andSCreaterTimeLessThan(Date value) {
            addCriterion("s_creater_time <", value, "sCreaterTime");
            return (Criteria) this;
        }

        public Criteria andSCreaterTimeLessThanOrEqualTo(Date value) {
            addCriterion("s_creater_time <=", value, "sCreaterTime");
            return (Criteria) this;
        }

        public Criteria andSCreaterTimeIn(List<Date> values) {
            addCriterion("s_creater_time in", values, "sCreaterTime");
            return (Criteria) this;
        }

        public Criteria andSCreaterTimeNotIn(List<Date> values) {
            addCriterion("s_creater_time not in", values, "sCreaterTime");
            return (Criteria) this;
        }

        public Criteria andSCreaterTimeBetween(Date value1, Date value2) {
            addCriterion("s_creater_time between", value1, value2, "sCreaterTime");
            return (Criteria) this;
        }

        public Criteria andSCreaterTimeNotBetween(Date value1, Date value2) {
            addCriterion("s_creater_time not between", value1, value2, "sCreaterTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeIsNull() {
            addCriterion("s_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeIsNotNull() {
            addCriterion("s_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeEqualTo(Date value) {
            addCriterion("s_update_time =", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeNotEqualTo(Date value) {
            addCriterion("s_update_time <>", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeGreaterThan(Date value) {
            addCriterion("s_update_time >", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("s_update_time >=", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeLessThan(Date value) {
            addCriterion("s_update_time <", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("s_update_time <=", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeIn(List<Date> values) {
            addCriterion("s_update_time in", values, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeNotIn(List<Date> values) {
            addCriterion("s_update_time not in", values, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("s_update_time between", value1, value2, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("s_update_time not between", value1, value2, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdaterIsNull() {
            addCriterion("s_updater is null");
            return (Criteria) this;
        }

        public Criteria andSUpdaterIsNotNull() {
            addCriterion("s_updater is not null");
            return (Criteria) this;
        }

        public Criteria andSUpdaterEqualTo(String value) {
            addCriterion("s_updater =", value, "sUpdater");
            return (Criteria) this;
        }

        public Criteria andSUpdaterNotEqualTo(String value) {
            addCriterion("s_updater <>", value, "sUpdater");
            return (Criteria) this;
        }

        public Criteria andSUpdaterGreaterThan(String value) {
            addCriterion("s_updater >", value, "sUpdater");
            return (Criteria) this;
        }

        public Criteria andSUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("s_updater >=", value, "sUpdater");
            return (Criteria) this;
        }

        public Criteria andSUpdaterLessThan(String value) {
            addCriterion("s_updater <", value, "sUpdater");
            return (Criteria) this;
        }

        public Criteria andSUpdaterLessThanOrEqualTo(String value) {
            addCriterion("s_updater <=", value, "sUpdater");
            return (Criteria) this;
        }

        public Criteria andSUpdaterLike(String value) {
            addCriterion("s_updater like", value, "sUpdater");
            return (Criteria) this;
        }

        public Criteria andSUpdaterNotLike(String value) {
            addCriterion("s_updater not like", value, "sUpdater");
            return (Criteria) this;
        }

        public Criteria andSUpdaterIn(List<String> values) {
            addCriterion("s_updater in", values, "sUpdater");
            return (Criteria) this;
        }

        public Criteria andSUpdaterNotIn(List<String> values) {
            addCriterion("s_updater not in", values, "sUpdater");
            return (Criteria) this;
        }

        public Criteria andSUpdaterBetween(String value1, String value2) {
            addCriterion("s_updater between", value1, value2, "sUpdater");
            return (Criteria) this;
        }

        public Criteria andSUpdaterNotBetween(String value1, String value2) {
            addCriterion("s_updater not between", value1, value2, "sUpdater");
            return (Criteria) this;
        }

        public Criteria andInstIdIsNull() {
            addCriterion("inst_id is null");
            return (Criteria) this;
        }

        public Criteria andInstIdIsNotNull() {
            addCriterion("inst_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstIdEqualTo(String value) {
            addCriterion("inst_id =", value, "instId");
            return (Criteria) this;
        }

        public Criteria andInstIdNotEqualTo(String value) {
            addCriterion("inst_id <>", value, "instId");
            return (Criteria) this;
        }

        public Criteria andInstIdGreaterThan(String value) {
            addCriterion("inst_id >", value, "instId");
            return (Criteria) this;
        }

        public Criteria andInstIdGreaterThanOrEqualTo(String value) {
            addCriterion("inst_id >=", value, "instId");
            return (Criteria) this;
        }

        public Criteria andInstIdLessThan(String value) {
            addCriterion("inst_id <", value, "instId");
            return (Criteria) this;
        }

        public Criteria andInstIdLessThanOrEqualTo(String value) {
            addCriterion("inst_id <=", value, "instId");
            return (Criteria) this;
        }

        public Criteria andInstIdLike(String value) {
            addCriterion("inst_id like", value, "instId");
            return (Criteria) this;
        }

        public Criteria andInstIdNotLike(String value) {
            addCriterion("inst_id not like", value, "instId");
            return (Criteria) this;
        }

        public Criteria andInstIdIn(List<String> values) {
            addCriterion("inst_id in", values, "instId");
            return (Criteria) this;
        }

        public Criteria andInstIdNotIn(List<String> values) {
            addCriterion("inst_id not in", values, "instId");
            return (Criteria) this;
        }

        public Criteria andInstIdBetween(String value1, String value2) {
            addCriterion("inst_id between", value1, value2, "instId");
            return (Criteria) this;
        }

        public Criteria andInstIdNotBetween(String value1, String value2) {
            addCriterion("inst_id not between", value1, value2, "instId");
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