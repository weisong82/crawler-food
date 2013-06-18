package dao;

public class Recipeallinone {
    private Integer recipeid;

    private String name;

    private String mainimages;

    private String recruit;

    private String taste;

    private Integer cookingtime;

    private String mainingredient;

    private String ingredient;

    private String funcational;

    private String comment;

    private Integer time;

    private String description;

    private String stepimages;

    private String stepingredient;

    private String audio;

    public Integer getRecipeid() {
        return recipeid;
    }

    public void setRecipeid(Integer recipeid) {
        this.recipeid = recipeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMainimages() {
        return mainimages;
    }

    public void setMainimages(String mainimages) {
        this.mainimages = mainimages == null ? null : mainimages.trim();
    }

    public String getRecruit() {
        return recruit;
    }

    public void setRecruit(String recruit) {
        this.recruit = recruit == null ? null : recruit.trim();
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste == null ? null : taste.trim();
    }

    public Integer getCookingtime() {
        return cookingtime;
    }

    public void setCookingtime(Integer cookingtime) {
        this.cookingtime = cookingtime;
    }

    public String getMainingredient() {
        return mainingredient;
    }

    public void setMainingredient(String mainingredient) {
        this.mainingredient = mainingredient == null ? null : mainingredient.trim();
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient == null ? null : ingredient.trim();
    }

    public String getFuncational() {
        return funcational;
    }

    public void setFuncational(String funcational) {
        this.funcational = funcational == null ? null : funcational.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getStepimages() {
        return stepimages;
    }

    public void setStepimages(String stepimages) {
        this.stepimages = stepimages == null ? null : stepimages.trim();
    }

    public String getStepingredient() {
        return stepingredient;
    }

    public void setStepingredient(String stepingredient) {
        this.stepingredient = stepingredient == null ? null : stepingredient.trim();
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio == null ? null : audio.trim();
    }
}