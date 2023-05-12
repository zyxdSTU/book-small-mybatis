package org.example.dao;


import org.example.po.Activity;

public interface IActivityDao {

    Activity queryActivityById(Long activityId);

}
