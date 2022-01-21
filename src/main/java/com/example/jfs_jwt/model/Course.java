package com.example.jfs_jwt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
   @Id
   @GeneratedValue
   private Integer id;
   private String name;
   private String objectives;

   public Course( String name, String objectives) {
      this.name = name;
      this.objectives = objectives;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getObjectives() {
      return objectives;
   }

   public void setObjectives(String objectives) {
      this.objectives = objectives;
   }

   @Override
   public String toString() {
      return "Course{" +
              "id='" + id + '\'' +
              ", name='" + name + '\'' +
              ", objectives='" + objectives + '\'' +
              '}';
   }
}
