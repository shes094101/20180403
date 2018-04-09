public class ch3 extends Person{  //弓手
    public ch3(String name1, String category1, Float attack1, Float blood1,Float res1){
        super ( name1,  category1,  attack1,  blood1, res1);}

    public void showAll() {
        System.out.println("---------------我是分隔線--------------");
        System.out.println("            Name(角色):" + this.getName());
        System.out.println("            Career(職業):");
        System.out.println("            Category(屬性):" + this.getCategory());
        System.out.println("            Attack(攻擊力):" + this.getAttack());
        System.out.println("            Blood(血量):" + this.getBlood());
        System.out.println("            Resilience(回復力):" + this.getRes());
        System.out.println("---------------我是分隔線--------------");
    }
    public void showeffectadd() {
        System.out.println("---------------我是分隔線--------------");
        System.out.println("物理爆擊+40%");
        System.out.println("物理攻擊+10%");
        System.out.println("+10%");
        System.out.println("---------------我是分隔線--------------");
    }
}
