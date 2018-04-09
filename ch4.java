public class ch4 extends Person{  //補師
    public ch4(String name1, String category1, Float attack1, Float blood1,Float res1){
        super ( name1,  category1,  attack1,  blood1, res1);}

    public void showAll() {
        System.out.println("---------------我是分隔線--------------");
        System.out.println("            Name(角色):" + this.getName());
        System.out.println("            Career(職業):補師");
        System.out.println("            Category(屬性):" + this.getCategory());
        System.out.println("            Attack(攻擊力):" + this.getAttack());
        System.out.println("            Blood(血量):" + this.getBlood());
        System.out.println("            Resilience(回復力):" + this.getRes());
        System.out.println("---------------我是分隔線--------------");
    }
    public void showeffectadd() {
        System.out.println("---------------我是分隔線--------------");
        System.out.println("治療能力+40%");
        System.out.println("魔法防御+20%");
        System.out.println("異常效果-10%");
        System.out.println("---------------我是分隔線--------------");
    }
}
