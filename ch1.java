public class ch1 extends Person { //戰士
    public ch1(String name1, String category1, Float attack1, Float blood1, Float res1) {
        super(name1, category1, attack1, blood1, res1); }

    public void showAll() {
        System.out.println("---------------我是分隔線--------------");
        System.out.println("            Name(角色):" + this.getName());
        System.out.println("            Career(職業):戰士");
        System.out.println("            Category(屬性):" + this.getCategory());
        System.out.println("            Attack(攻擊力):" + this.getAttack());
        System.out.println("            Blood(血量):" + this.getBlood());
        System.out.println("            Resilience(回復力):" + this.getRes());
        System.out.println("---------------我是分隔線--------------");
    }
    public void showeffectadd() {
        System.out.println("---------------我是分隔線--------------");
        System.out.println("物理攻擊+30%");
        System.out.println("物理防禦+10%");
        System.out.println("速度+10%");
        System.out.println("---------------我是分隔線--------------");
    }
}