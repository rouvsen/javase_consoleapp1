package menu;

import bean.Config;
import bean.Teacher;
import menu.inter.MenuAddTeacherServiceInter;
import util.DetailsUtil;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void process() {
        Teacher t = new Teacher();
        t.setName(DetailsUtil.enterName());
        t.setSurname(DetailsUtil.enterSurname());

        Config.instance().addTeacher(t);
    }
}