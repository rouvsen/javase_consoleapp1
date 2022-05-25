package menu;

import bean.Config;
import bean.Teacher;
import menu.inter.MenuShowTeacherServiceInter;
public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
    public void process() {
        Teacher[] teachers = Config.instance().getTeachers();
        for (int i = 0; i < teachers.length; i++) {
            System.out.println(teachers[i]);
        }
    }
}
