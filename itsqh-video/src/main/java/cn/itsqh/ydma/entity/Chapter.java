package cn.itsqh.ydma.entity;

import java.io.Serializable;
import java.util.List;

public class Chapter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chapter.id
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chapter.name
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chapter.course_id
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    private Integer courseId;
    
    private List<Video> videos;
    
    //	笔记集
    private List notes;
    //	评论集
    private List evaluates;

    

	public List getEvaluates() {
		return evaluates;
	}

	public void setEvaluates(List evaluates) {
		this.evaluates = evaluates;
	}

	public List getNotes() {
		return notes;
	}

	public void setNotes(List notes) {
		this.notes = notes;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chapter.id
     *
     * @return the value of chapter.id
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chapter.id
     *
     * @param id the value for chapter.id
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chapter.name
     *
     * @return the value of chapter.name
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chapter.name
     *
     * @param name the value for chapter.name
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chapter.course_id
     *
     * @return the value of chapter.course_id
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chapter.course_id
     *
     * @param courseId the value for chapter.course_id
     *
     * @mbg.generated Mon Jul 08 09:27:38 CST 2019
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}