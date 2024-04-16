package model;

import java.util.Date;

/**
 * Represents the search criteria used in article searches within the application.
 * This includes the search term used, the category of the search, and the date range for the search.
 */
public class ArticleSearchCriteria {

    /**
     * Unique identifier for the ArticleSearchCriteria.
     */
    private Integer id;

    /**
     * The search term used in the article search.
     */
    private String searchTerm;

    /**
     * The category of the articles being searched.
     */
    private KnowledgeBaseCategories category;

    /**
     * The start date of the search period.
     */
    private Date startDate;

    /**
     * The end date of the search period.
     */
    private Date endDate;

    /**
     * Gets the unique identifier for the ArticleSearchCriteria.
     * 
     * @return the unique identifier for the ArticleSearchCriteria.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the ArticleSearchCriteria.
     * 
     * @param id the unique identifier for this search criteria.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the search term used in the article search.
     * 
     * @return the search term used.
     */
    public String getSearchTerm() {
        return searchTerm;
    }

    /**
     * Sets the search term used in the article search.
     * 
     * @param searchTerm the search term to set.
     */
    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    /**
     * Gets the category of the articles being searched.
     * 
     * @return the category of the articles.
     */
    public KnowledgeBaseCategories getCategory() {
        return category;
    }

    /**
     * Sets the category of the articles being searched.
     * 
     * @param category the category to set.
     */
    public void setCategory(KnowledgeBaseCategories category) {
        this.category = category;
    }

    /**
     * Gets the start date of the search period.
     * 
     * @return the start date of the search period.
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date of the search period.
     * 
     * @param startDate the start date to set.
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Gets the end date of the search period.
     * 
     * @return the end date of the search period.
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the end date of the search period.
     * 
     * @param endDate the end date to set.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * Enum representing the predefined categories of knowledge base articles that can be searched.
     */
    public enum KnowledgeBaseCategories {
        TECHNOLOGY,
        PRIVACY,
        USER_GUIDES,
        COMPLAINT_PROCESSES,
        TROUBLESHOOTING,
        COMMON_ISSUES
    }
}