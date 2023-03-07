package Test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role(String name, int blood) {//带参构造
        this.name = name;
        this.blood = blood;
    }

    public Role() {//空参构造
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }


    public void setBlood(int blood) {
        this.blood = blood;
    }


    //定义攻击方法
    //方法的调用者攻击参数
    public void attack(Role role){
        //计算造成伤害
        Random r = new Random();
        int hurt = r.nextInt(20)+1;

        //修改一下挨揍的人的血量
        int remainBoold = role.getBlood()-hurt;
        //负数血量
        remainBoold = remainBoold < 0?0:remainBoold;
        role.setBlood(remainBoold);

        //this表示方法的调用者
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，" +
                "造成了" + hurt + "点伤害，" + role.getName() + "还剩下了" + remainBoold + "点血");

    }
}
