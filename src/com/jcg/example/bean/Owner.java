
package com.jcg.example.bean;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;

@Generated("org.jsonschema2pojo")
public class Owner {

    private String login;
    private Integer id;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("gravatar_id")
    private String gravatarId;
    private String url;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("followers_url")
    private String followersUrl;
    @JsonProperty("following_url")
    private String followingUrl;
    @JsonProperty("gists_url")
    private String gistsUrl;
    @JsonProperty("starred_url")
    private String starredUrl;
    @JsonProperty("subscriptions_url")
    private String subscriptionsUrl;
    @JsonProperty("organizations_url")
    private String organizationsUrl;
    @JsonProperty("repos_url")
    private String reposUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("received_events_url")
    private String receivedEventsUrl;
    @JsonProperty("type")
    private String type;
    @JsonProperty("site_admin")
    private Boolean siteAdmin;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The login
     */
    public String getLogin() {
        return login;
    }

    /**
     * 
     * @param login
     *     The login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 
     * @param avatarUrl
     *     The avatar_url
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * 
     * @return
     *     The gravatarId
     */
    public String getGravatarId() {
        return gravatarId;
    }

    /**
     * 
     * @param gravatarId
     *     The gravatar_id
     */
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The htmlUrl
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * 
     * @param htmlUrl
     *     The html_url
     */
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * 
     * @return
     *     The followersUrl
     */
    public String getFollowersUrl() {
        return followersUrl;
    }

    /**
     * 
     * @param followersUrl
     *     The followers_url
     */
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    /**
     * 
     * @return
     *     The followingUrl
     */
    public String getFollowingUrl() {
        return followingUrl;
    }

    /**
     * 
     * @param followingUrl
     *     The following_url
     */
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    /**
     * 
     * @return
     *     The gistsUrl
     */
    public String getGistsUrl() {
        return gistsUrl;
    }

    /**
     * 
     * @param gistsUrl
     *     The gists_url
     */
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    /**
     * 
     * @return
     *     The starredUrl
     */
    public String getStarredUrl() {
        return starredUrl;
    }

    /**
     * 
     * @param starredUrl
     *     The starred_url
     */
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    /**
     * 
     * @return
     *     The subscriptionsUrl
     */
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    /**
     * 
     * @param subscriptionsUrl
     *     The subscriptions_url
     */
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    /**
     * 
     * @return
     *     The organizationsUrl
     */
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    /**
     * 
     * @param organizationsUrl
     *     The organizations_url
     */
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    /**
     * 
     * @return
     *     The reposUrl
     */
    public String getReposUrl() {
        return reposUrl;
    }

    /**
     * 
     * @param reposUrl
     *     The repos_url
     */
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    /**
     * 
     * @return
     *     The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     * 
     * @param eventsUrl
     *     The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
     * 
     * @return
     *     The receivedEventsUrl
     */
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    /**
     * 
     * @param receivedEventsUrl
     *     The received_events_url
     */
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The siteAdmin
     */
    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    /**
     * 
     * @param siteAdmin
     *     The site_admin
     */
    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
