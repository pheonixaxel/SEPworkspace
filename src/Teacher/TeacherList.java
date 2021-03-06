package Teacher;

import java.util.ArrayList;
import java.util.Objects;

public class TeacherList //
{
  private ArrayList<Teacher> teachers; //jh

  public TeacherList(ArrayList <Teacher> teachers){
    this.teachers=teachers;
  }

  public ArrayList<Teacher> getAllTeachers(){
    return teachers;
  }

  public Teacher getTeacher (int index){
    return teachers.get(index);
  }

  public void addTeacher(Teacher teacher){
    teachers.add(teacher);
  }

  public void removeTeacher(Teacher teacher){
    teachers.remove(teacher);
  }

  public int size(){
    return teachers.size();
  }

   public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass()) /////c
      return false;

    TeacherList obj = (TeacherList) o;

    return Objects.equals(teachers, obj.teachers);
  }

  public String toString()
  {
    return "Teachers" + teachers;
  }
}
