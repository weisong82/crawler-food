package dao;

import java.util.ArrayList;
import java.util.List;

public class RecipeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecipeExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andRecruitIsNull() {
            addCriterion("recruit is null");
            return (Criteria) this;
        }

        public Criteria andRecruitIsNotNull() {
            addCriterion("recruit is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitEqualTo(String value) {
            addCriterion("recruit =", value, "recruit");
            return (Criteria) this;
        }

        public Criteria andRecruitNotEqualTo(String value) {
            addCriterion("recruit <>", value, "recruit");
            return (Criteria) this;
        }

        public Criteria andRecruitGreaterThan(String value) {
            addCriterion("recruit >", value, "recruit");
            return (Criteria) this;
        }

        public Criteria andRecruitGreaterThanOrEqualTo(String value) {
            addCriterion("recruit >=", value, "recruit");
            return (Criteria) this;
        }

        public Criteria andRecruitLessThan(String value) {
            addCriterion("recruit <", value, "recruit");
            return (Criteria) this;
        }

        public Criteria andRecruitLessThanOrEqualTo(String value) {
            addCriterion("recruit <=", value, "recruit");
            return (Criteria) this;
        }

        public Criteria andRecruitLike(String value) {
            addCriterion("recruit like", value, "recruit");
            return (Criteria) this;
        }

        public Criteria andRecruitNotLike(String value) {
            addCriterion("recruit not like", value, "recruit");
            return (Criteria) this;
        }

        public Criteria andRecruitIn(List<String> values) {
            addCriterion("recruit in", values, "recruit");
            return (Criteria) this;
        }

        public Criteria andRecruitNotIn(List<String> values) {
            addCriterion("recruit not in", values, "recruit");
            return (Criteria) this;
        }

        public Criteria andRecruitBetween(String value1, String value2) {
            addCriterion("recruit between", value1, value2, "recruit");
            return (Criteria) this;
        }

        public Criteria andRecruitNotBetween(String value1, String value2) {
            addCriterion("recruit not between", value1, value2, "recruit");
            return (Criteria) this;
        }

        public Criteria andTasteIsNull() {
            addCriterion("taste is null");
            return (Criteria) this;
        }

        public Criteria andTasteIsNotNull() {
            addCriterion("taste is not null");
            return (Criteria) this;
        }

        public Criteria andTasteEqualTo(String value) {
            addCriterion("taste =", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotEqualTo(String value) {
            addCriterion("taste <>", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteGreaterThan(String value) {
            addCriterion("taste >", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteGreaterThanOrEqualTo(String value) {
            addCriterion("taste >=", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLessThan(String value) {
            addCriterion("taste <", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLessThanOrEqualTo(String value) {
            addCriterion("taste <=", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLike(String value) {
            addCriterion("taste like", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotLike(String value) {
            addCriterion("taste not like", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteIn(List<String> values) {
            addCriterion("taste in", values, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotIn(List<String> values) {
            addCriterion("taste not in", values, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteBetween(String value1, String value2) {
            addCriterion("taste between", value1, value2, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotBetween(String value1, String value2) {
            addCriterion("taste not between", value1, value2, "taste");
            return (Criteria) this;
        }

        public Criteria andSetuptimeIsNull() {
            addCriterion("setupTime is null");
            return (Criteria) this;
        }

        public Criteria andSetuptimeIsNotNull() {
            addCriterion("setupTime is not null");
            return (Criteria) this;
        }

        public Criteria andSetuptimeEqualTo(String value) {
            addCriterion("setupTime =", value, "setuptime");
            return (Criteria) this;
        }

        public Criteria andSetuptimeNotEqualTo(String value) {
            addCriterion("setupTime <>", value, "setuptime");
            return (Criteria) this;
        }

        public Criteria andSetuptimeGreaterThan(String value) {
            addCriterion("setupTime >", value, "setuptime");
            return (Criteria) this;
        }

        public Criteria andSetuptimeGreaterThanOrEqualTo(String value) {
            addCriterion("setupTime >=", value, "setuptime");
            return (Criteria) this;
        }

        public Criteria andSetuptimeLessThan(String value) {
            addCriterion("setupTime <", value, "setuptime");
            return (Criteria) this;
        }

        public Criteria andSetuptimeLessThanOrEqualTo(String value) {
            addCriterion("setupTime <=", value, "setuptime");
            return (Criteria) this;
        }

        public Criteria andSetuptimeLike(String value) {
            addCriterion("setupTime like", value, "setuptime");
            return (Criteria) this;
        }

        public Criteria andSetuptimeNotLike(String value) {
            addCriterion("setupTime not like", value, "setuptime");
            return (Criteria) this;
        }

        public Criteria andSetuptimeIn(List<String> values) {
            addCriterion("setupTime in", values, "setuptime");
            return (Criteria) this;
        }

        public Criteria andSetuptimeNotIn(List<String> values) {
            addCriterion("setupTime not in", values, "setuptime");
            return (Criteria) this;
        }

        public Criteria andSetuptimeBetween(String value1, String value2) {
            addCriterion("setupTime between", value1, value2, "setuptime");
            return (Criteria) this;
        }

        public Criteria andSetuptimeNotBetween(String value1, String value2) {
            addCriterion("setupTime not between", value1, value2, "setuptime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeIsNull() {
            addCriterion("cookingTime is null");
            return (Criteria) this;
        }

        public Criteria andCookingtimeIsNotNull() {
            addCriterion("cookingTime is not null");
            return (Criteria) this;
        }

        public Criteria andCookingtimeEqualTo(String value) {
            addCriterion("cookingTime =", value, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeNotEqualTo(String value) {
            addCriterion("cookingTime <>", value, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeGreaterThan(String value) {
            addCriterion("cookingTime >", value, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeGreaterThanOrEqualTo(String value) {
            addCriterion("cookingTime >=", value, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeLessThan(String value) {
            addCriterion("cookingTime <", value, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeLessThanOrEqualTo(String value) {
            addCriterion("cookingTime <=", value, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeLike(String value) {
            addCriterion("cookingTime like", value, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeNotLike(String value) {
            addCriterion("cookingTime not like", value, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeIn(List<String> values) {
            addCriterion("cookingTime in", values, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeNotIn(List<String> values) {
            addCriterion("cookingTime not in", values, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeBetween(String value1, String value2) {
            addCriterion("cookingTime between", value1, value2, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeNotBetween(String value1, String value2) {
            addCriterion("cookingTime not between", value1, value2, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andMainingredientIsNull() {
            addCriterion("mainIngredient is null");
            return (Criteria) this;
        }

        public Criteria andMainingredientIsNotNull() {
            addCriterion("mainIngredient is not null");
            return (Criteria) this;
        }

        public Criteria andMainingredientEqualTo(String value) {
            addCriterion("mainIngredient =", value, "mainingredient");
            return (Criteria) this;
        }

        public Criteria andMainingredientNotEqualTo(String value) {
            addCriterion("mainIngredient <>", value, "mainingredient");
            return (Criteria) this;
        }

        public Criteria andMainingredientGreaterThan(String value) {
            addCriterion("mainIngredient >", value, "mainingredient");
            return (Criteria) this;
        }

        public Criteria andMainingredientGreaterThanOrEqualTo(String value) {
            addCriterion("mainIngredient >=", value, "mainingredient");
            return (Criteria) this;
        }

        public Criteria andMainingredientLessThan(String value) {
            addCriterion("mainIngredient <", value, "mainingredient");
            return (Criteria) this;
        }

        public Criteria andMainingredientLessThanOrEqualTo(String value) {
            addCriterion("mainIngredient <=", value, "mainingredient");
            return (Criteria) this;
        }

        public Criteria andMainingredientLike(String value) {
            addCriterion("mainIngredient like", value, "mainingredient");
            return (Criteria) this;
        }

        public Criteria andMainingredientNotLike(String value) {
            addCriterion("mainIngredient not like", value, "mainingredient");
            return (Criteria) this;
        }

        public Criteria andMainingredientIn(List<String> values) {
            addCriterion("mainIngredient in", values, "mainingredient");
            return (Criteria) this;
        }

        public Criteria andMainingredientNotIn(List<String> values) {
            addCriterion("mainIngredient not in", values, "mainingredient");
            return (Criteria) this;
        }

        public Criteria andMainingredientBetween(String value1, String value2) {
            addCriterion("mainIngredient between", value1, value2, "mainingredient");
            return (Criteria) this;
        }

        public Criteria andMainingredientNotBetween(String value1, String value2) {
            addCriterion("mainIngredient not between", value1, value2, "mainingredient");
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

        public Criteria andFuncationalIsNull() {
            addCriterion("funcational is null");
            return (Criteria) this;
        }

        public Criteria andFuncationalIsNotNull() {
            addCriterion("funcational is not null");
            return (Criteria) this;
        }

        public Criteria andFuncationalEqualTo(String value) {
            addCriterion("funcational =", value, "funcational");
            return (Criteria) this;
        }

        public Criteria andFuncationalNotEqualTo(String value) {
            addCriterion("funcational <>", value, "funcational");
            return (Criteria) this;
        }

        public Criteria andFuncationalGreaterThan(String value) {
            addCriterion("funcational >", value, "funcational");
            return (Criteria) this;
        }

        public Criteria andFuncationalGreaterThanOrEqualTo(String value) {
            addCriterion("funcational >=", value, "funcational");
            return (Criteria) this;
        }

        public Criteria andFuncationalLessThan(String value) {
            addCriterion("funcational <", value, "funcational");
            return (Criteria) this;
        }

        public Criteria andFuncationalLessThanOrEqualTo(String value) {
            addCriterion("funcational <=", value, "funcational");
            return (Criteria) this;
        }

        public Criteria andFuncationalLike(String value) {
            addCriterion("funcational like", value, "funcational");
            return (Criteria) this;
        }

        public Criteria andFuncationalNotLike(String value) {
            addCriterion("funcational not like", value, "funcational");
            return (Criteria) this;
        }

        public Criteria andFuncationalIn(List<String> values) {
            addCriterion("funcational in", values, "funcational");
            return (Criteria) this;
        }

        public Criteria andFuncationalNotIn(List<String> values) {
            addCriterion("funcational not in", values, "funcational");
            return (Criteria) this;
        }

        public Criteria andFuncationalBetween(String value1, String value2) {
            addCriterion("funcational between", value1, value2, "funcational");
            return (Criteria) this;
        }

        public Criteria andFuncationalNotBetween(String value1, String value2) {
            addCriterion("funcational not between", value1, value2, "funcational");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
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