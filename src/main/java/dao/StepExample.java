package dao;

import java.util.ArrayList;
import java.util.List;

public class StepExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StepExample() {
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

        public Criteria andStepidIsNull() {
            addCriterion("stepId is null");
            return (Criteria) this;
        }

        public Criteria andStepidIsNotNull() {
            addCriterion("stepId is not null");
            return (Criteria) this;
        }

        public Criteria andStepidEqualTo(Integer value) {
            addCriterion("stepId =", value, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidNotEqualTo(Integer value) {
            addCriterion("stepId <>", value, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidGreaterThan(Integer value) {
            addCriterion("stepId >", value, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stepId >=", value, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidLessThan(Integer value) {
            addCriterion("stepId <", value, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidLessThanOrEqualTo(Integer value) {
            addCriterion("stepId <=", value, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidIn(List<Integer> values) {
            addCriterion("stepId in", values, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidNotIn(List<Integer> values) {
            addCriterion("stepId not in", values, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidBetween(Integer value1, Integer value2) {
            addCriterion("stepId between", value1, value2, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidNotBetween(Integer value1, Integer value2) {
            addCriterion("stepId not between", value1, value2, "stepid");
            return (Criteria) this;
        }

        public Criteria andRecipeidIsNull() {
            addCriterion("recipeId is null");
            return (Criteria) this;
        }

        public Criteria andRecipeidIsNotNull() {
            addCriterion("recipeId is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeidEqualTo(Integer value) {
            addCriterion("recipeId =", value, "recipeid");
            return (Criteria) this;
        }

        public Criteria andRecipeidNotEqualTo(Integer value) {
            addCriterion("recipeId <>", value, "recipeid");
            return (Criteria) this;
        }

        public Criteria andRecipeidGreaterThan(Integer value) {
            addCriterion("recipeId >", value, "recipeid");
            return (Criteria) this;
        }

        public Criteria andRecipeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recipeId >=", value, "recipeid");
            return (Criteria) this;
        }

        public Criteria andRecipeidLessThan(Integer value) {
            addCriterion("recipeId <", value, "recipeid");
            return (Criteria) this;
        }

        public Criteria andRecipeidLessThanOrEqualTo(Integer value) {
            addCriterion("recipeId <=", value, "recipeid");
            return (Criteria) this;
        }

        public Criteria andRecipeidIn(List<Integer> values) {
            addCriterion("recipeId in", values, "recipeid");
            return (Criteria) this;
        }

        public Criteria andRecipeidNotIn(List<Integer> values) {
            addCriterion("recipeId not in", values, "recipeid");
            return (Criteria) this;
        }

        public Criteria andRecipeidBetween(Integer value1, Integer value2) {
            addCriterion("recipeId between", value1, value2, "recipeid");
            return (Criteria) this;
        }

        public Criteria andRecipeidNotBetween(Integer value1, Integer value2) {
            addCriterion("recipeId not between", value1, value2, "recipeid");
            return (Criteria) this;
        }

        public Criteria andSteporderIsNull() {
            addCriterion("stepOrder is null");
            return (Criteria) this;
        }

        public Criteria andSteporderIsNotNull() {
            addCriterion("stepOrder is not null");
            return (Criteria) this;
        }

        public Criteria andSteporderEqualTo(Short value) {
            addCriterion("stepOrder =", value, "steporder");
            return (Criteria) this;
        }

        public Criteria andSteporderNotEqualTo(Short value) {
            addCriterion("stepOrder <>", value, "steporder");
            return (Criteria) this;
        }

        public Criteria andSteporderGreaterThan(Short value) {
            addCriterion("stepOrder >", value, "steporder");
            return (Criteria) this;
        }

        public Criteria andSteporderGreaterThanOrEqualTo(Short value) {
            addCriterion("stepOrder >=", value, "steporder");
            return (Criteria) this;
        }

        public Criteria andSteporderLessThan(Short value) {
            addCriterion("stepOrder <", value, "steporder");
            return (Criteria) this;
        }

        public Criteria andSteporderLessThanOrEqualTo(Short value) {
            addCriterion("stepOrder <=", value, "steporder");
            return (Criteria) this;
        }

        public Criteria andSteporderIn(List<Short> values) {
            addCriterion("stepOrder in", values, "steporder");
            return (Criteria) this;
        }

        public Criteria andSteporderNotIn(List<Short> values) {
            addCriterion("stepOrder not in", values, "steporder");
            return (Criteria) this;
        }

        public Criteria andSteporderBetween(Short value1, Short value2) {
            addCriterion("stepOrder between", value1, value2, "steporder");
            return (Criteria) this;
        }

        public Criteria andSteporderNotBetween(Short value1, Short value2) {
            addCriterion("stepOrder not between", value1, value2, "steporder");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andIngredientIsNull() {
            addCriterion("ingredient is null");
            return (Criteria) this;
        }

        public Criteria andIngredientIsNotNull() {
            addCriterion("ingredient is not null");
            return (Criteria) this;
        }

        public Criteria andIngredientEqualTo(String value) {
            addCriterion("ingredient =", value, "ingredient");
            return (Criteria) this;
        }

        public Criteria andIngredientNotEqualTo(String value) {
            addCriterion("ingredient <>", value, "ingredient");
            return (Criteria) this;
        }

        public Criteria andIngredientGreaterThan(String value) {
            addCriterion("ingredient >", value, "ingredient");
            return (Criteria) this;
        }

        public Criteria andIngredientGreaterThanOrEqualTo(String value) {
            addCriterion("ingredient >=", value, "ingredient");
            return (Criteria) this;
        }

        public Criteria andIngredientLessThan(String value) {
            addCriterion("ingredient <", value, "ingredient");
            return (Criteria) this;
        }

        public Criteria andIngredientLessThanOrEqualTo(String value) {
            addCriterion("ingredient <=", value, "ingredient");
            return (Criteria) this;
        }

        public Criteria andIngredientLike(String value) {
            addCriterion("ingredient like", value, "ingredient");
            return (Criteria) this;
        }

        public Criteria andIngredientNotLike(String value) {
            addCriterion("ingredient not like", value, "ingredient");
            return (Criteria) this;
        }

        public Criteria andIngredientIn(List<String> values) {
            addCriterion("ingredient in", values, "ingredient");
            return (Criteria) this;
        }

        public Criteria andIngredientNotIn(List<String> values) {
            addCriterion("ingredient not in", values, "ingredient");
            return (Criteria) this;
        }

        public Criteria andIngredientBetween(String value1, String value2) {
            addCriterion("ingredient between", value1, value2, "ingredient");
            return (Criteria) this;
        }

        public Criteria andIngredientNotBetween(String value1, String value2) {
            addCriterion("ingredient not between", value1, value2, "ingredient");
            return (Criteria) this;
        }

        public Criteria andAudioIsNull() {
            addCriterion("audio is null");
            return (Criteria) this;
        }

        public Criteria andAudioIsNotNull() {
            addCriterion("audio is not null");
            return (Criteria) this;
        }

        public Criteria andAudioEqualTo(String value) {
            addCriterion("audio =", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioNotEqualTo(String value) {
            addCriterion("audio <>", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioGreaterThan(String value) {
            addCriterion("audio >", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioGreaterThanOrEqualTo(String value) {
            addCriterion("audio >=", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioLessThan(String value) {
            addCriterion("audio <", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioLessThanOrEqualTo(String value) {
            addCriterion("audio <=", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioLike(String value) {
            addCriterion("audio like", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioNotLike(String value) {
            addCriterion("audio not like", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioIn(List<String> values) {
            addCriterion("audio in", values, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioNotIn(List<String> values) {
            addCriterion("audio not in", values, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioBetween(String value1, String value2) {
            addCriterion("audio between", value1, value2, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioNotBetween(String value1, String value2) {
            addCriterion("audio not between", value1, value2, "audio");
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