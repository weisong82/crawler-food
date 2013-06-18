package dao;

import java.util.ArrayList;
import java.util.List;

public class RecipeallinoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecipeallinoneExample() {
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

        public Criteria andMainimagesIsNull() {
            addCriterion("mainimages is null");
            return (Criteria) this;
        }

        public Criteria andMainimagesIsNotNull() {
            addCriterion("mainimages is not null");
            return (Criteria) this;
        }

        public Criteria andMainimagesEqualTo(String value) {
            addCriterion("mainimages =", value, "mainimages");
            return (Criteria) this;
        }

        public Criteria andMainimagesNotEqualTo(String value) {
            addCriterion("mainimages <>", value, "mainimages");
            return (Criteria) this;
        }

        public Criteria andMainimagesGreaterThan(String value) {
            addCriterion("mainimages >", value, "mainimages");
            return (Criteria) this;
        }

        public Criteria andMainimagesGreaterThanOrEqualTo(String value) {
            addCriterion("mainimages >=", value, "mainimages");
            return (Criteria) this;
        }

        public Criteria andMainimagesLessThan(String value) {
            addCriterion("mainimages <", value, "mainimages");
            return (Criteria) this;
        }

        public Criteria andMainimagesLessThanOrEqualTo(String value) {
            addCriterion("mainimages <=", value, "mainimages");
            return (Criteria) this;
        }

        public Criteria andMainimagesLike(String value) {
            addCriterion("mainimages like", value, "mainimages");
            return (Criteria) this;
        }

        public Criteria andMainimagesNotLike(String value) {
            addCriterion("mainimages not like", value, "mainimages");
            return (Criteria) this;
        }

        public Criteria andMainimagesIn(List<String> values) {
            addCriterion("mainimages in", values, "mainimages");
            return (Criteria) this;
        }

        public Criteria andMainimagesNotIn(List<String> values) {
            addCriterion("mainimages not in", values, "mainimages");
            return (Criteria) this;
        }

        public Criteria andMainimagesBetween(String value1, String value2) {
            addCriterion("mainimages between", value1, value2, "mainimages");
            return (Criteria) this;
        }

        public Criteria andMainimagesNotBetween(String value1, String value2) {
            addCriterion("mainimages not between", value1, value2, "mainimages");
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

        public Criteria andCookingtimeIsNull() {
            addCriterion("cookingTime is null");
            return (Criteria) this;
        }

        public Criteria andCookingtimeIsNotNull() {
            addCriterion("cookingTime is not null");
            return (Criteria) this;
        }

        public Criteria andCookingtimeEqualTo(Integer value) {
            addCriterion("cookingTime =", value, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeNotEqualTo(Integer value) {
            addCriterion("cookingTime <>", value, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeGreaterThan(Integer value) {
            addCriterion("cookingTime >", value, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cookingTime >=", value, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeLessThan(Integer value) {
            addCriterion("cookingTime <", value, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeLessThanOrEqualTo(Integer value) {
            addCriterion("cookingTime <=", value, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeIn(List<Integer> values) {
            addCriterion("cookingTime in", values, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeNotIn(List<Integer> values) {
            addCriterion("cookingTime not in", values, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeBetween(Integer value1, Integer value2) {
            addCriterion("cookingTime between", value1, value2, "cookingtime");
            return (Criteria) this;
        }

        public Criteria andCookingtimeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andStepimagesIsNull() {
            addCriterion("stepimages is null");
            return (Criteria) this;
        }

        public Criteria andStepimagesIsNotNull() {
            addCriterion("stepimages is not null");
            return (Criteria) this;
        }

        public Criteria andStepimagesEqualTo(String value) {
            addCriterion("stepimages =", value, "stepimages");
            return (Criteria) this;
        }

        public Criteria andStepimagesNotEqualTo(String value) {
            addCriterion("stepimages <>", value, "stepimages");
            return (Criteria) this;
        }

        public Criteria andStepimagesGreaterThan(String value) {
            addCriterion("stepimages >", value, "stepimages");
            return (Criteria) this;
        }

        public Criteria andStepimagesGreaterThanOrEqualTo(String value) {
            addCriterion("stepimages >=", value, "stepimages");
            return (Criteria) this;
        }

        public Criteria andStepimagesLessThan(String value) {
            addCriterion("stepimages <", value, "stepimages");
            return (Criteria) this;
        }

        public Criteria andStepimagesLessThanOrEqualTo(String value) {
            addCriterion("stepimages <=", value, "stepimages");
            return (Criteria) this;
        }

        public Criteria andStepimagesLike(String value) {
            addCriterion("stepimages like", value, "stepimages");
            return (Criteria) this;
        }

        public Criteria andStepimagesNotLike(String value) {
            addCriterion("stepimages not like", value, "stepimages");
            return (Criteria) this;
        }

        public Criteria andStepimagesIn(List<String> values) {
            addCriterion("stepimages in", values, "stepimages");
            return (Criteria) this;
        }

        public Criteria andStepimagesNotIn(List<String> values) {
            addCriterion("stepimages not in", values, "stepimages");
            return (Criteria) this;
        }

        public Criteria andStepimagesBetween(String value1, String value2) {
            addCriterion("stepimages between", value1, value2, "stepimages");
            return (Criteria) this;
        }

        public Criteria andStepimagesNotBetween(String value1, String value2) {
            addCriterion("stepimages not between", value1, value2, "stepimages");
            return (Criteria) this;
        }

        public Criteria andStepingredientIsNull() {
            addCriterion("stepingredient is null");
            return (Criteria) this;
        }

        public Criteria andStepingredientIsNotNull() {
            addCriterion("stepingredient is not null");
            return (Criteria) this;
        }

        public Criteria andStepingredientEqualTo(String value) {
            addCriterion("stepingredient =", value, "stepingredient");
            return (Criteria) this;
        }

        public Criteria andStepingredientNotEqualTo(String value) {
            addCriterion("stepingredient <>", value, "stepingredient");
            return (Criteria) this;
        }

        public Criteria andStepingredientGreaterThan(String value) {
            addCriterion("stepingredient >", value, "stepingredient");
            return (Criteria) this;
        }

        public Criteria andStepingredientGreaterThanOrEqualTo(String value) {
            addCriterion("stepingredient >=", value, "stepingredient");
            return (Criteria) this;
        }

        public Criteria andStepingredientLessThan(String value) {
            addCriterion("stepingredient <", value, "stepingredient");
            return (Criteria) this;
        }

        public Criteria andStepingredientLessThanOrEqualTo(String value) {
            addCriterion("stepingredient <=", value, "stepingredient");
            return (Criteria) this;
        }

        public Criteria andStepingredientLike(String value) {
            addCriterion("stepingredient like", value, "stepingredient");
            return (Criteria) this;
        }

        public Criteria andStepingredientNotLike(String value) {
            addCriterion("stepingredient not like", value, "stepingredient");
            return (Criteria) this;
        }

        public Criteria andStepingredientIn(List<String> values) {
            addCriterion("stepingredient in", values, "stepingredient");
            return (Criteria) this;
        }

        public Criteria andStepingredientNotIn(List<String> values) {
            addCriterion("stepingredient not in", values, "stepingredient");
            return (Criteria) this;
        }

        public Criteria andStepingredientBetween(String value1, String value2) {
            addCriterion("stepingredient between", value1, value2, "stepingredient");
            return (Criteria) this;
        }

        public Criteria andStepingredientNotBetween(String value1, String value2) {
            addCriterion("stepingredient not between", value1, value2, "stepingredient");
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