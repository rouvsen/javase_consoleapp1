package menu;

import bean.Config;
import bean.Student;
import menu.inter.MenuAddStudentServiceInter;
import util.DetailsUtil;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void process() {
        Student s = new Student();
        s.setName(DetailsUtil.enterName());
        s.setSurname(DetailsUtil.enterSurname());

        Config.instance().addStudent(s);
    }
}
