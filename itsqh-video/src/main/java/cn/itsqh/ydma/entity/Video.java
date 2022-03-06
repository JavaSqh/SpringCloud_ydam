package cn.itsqh.ydma.entity;

import java.io.Serializable;

public class Video implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.id
     *
     * @mbg.generated Thu Jul 04 14:19:57 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.name
     *
     * @mbg.generated Thu Jul 04 14:19:57 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.url
     *
     * @mbg.generated Thu Jul 04 14:19:57 CST 2019
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.chapter_id
     *
     * @mbg.generated Thu Jul 04 14:19:57 CST 2019
     */
    private Integer chapterId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.id
     *
     * @return the value of video.id
     *
     * @mbg.generated Thu Jul 04 14:19:57 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.id
     *
     * @param id the value for video.id
     *
     * @mbg.generated Thu Jul 04 14:19:57 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.name
     *
     * @return the value of video.name
     *
     * @mbg.generated Thu Jul 04 14:19:57 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.name
     *
     * @param name the value for video.name
     *
     * @mbg.generated Thu Jul 04 14:19:57 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.url
     *
     * @return the value of video.url
     *
     * @mbg.generated Thu Jul 04 14:19:57 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.url
     *
     * @param url the value for video.url
     *
     * @mbg.generated Thu Jul 04 14:19:57 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.chapter_id
     *
     * @return the value of video.chapter_id
     *
     * @mbg.generated Thu Jul 04 14:19:57 CST 2019
     */
    public Integer getChapterId() {
        return chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.chapter_id
     *
     * @param chapterId the value for video.chapter_id
     *
     * @mbg.generated Thu Jul 04 14:19:57 CST 2019
     */
    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }
}