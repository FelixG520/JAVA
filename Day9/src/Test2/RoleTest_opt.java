package Test2;

public class RoleTest_opt {
    public static void main(String[] args) {
        //1.创建第一个角色
        Role_opt r1=new Role_opt("刘宣",100,'男');
        //2.创建第二个角色
        Role_opt r2=new Role_opt("高帆",100,'女');

        //展示一下角色的信息
        r1.showRoleInfo();
        r2.showRoleInfo();

        //3.开始格斗，回合制游戏
        while (true){
            //r1攻击r2
            r1.attack(r2);
            //判断r2的剩余血量
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"K.O.了"+r2.getName());
                break;
            }
            //r2攻击r1
            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName()+"K.O.了"+r1.getName());
                break;
            }
        }
    }
}
