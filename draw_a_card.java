public class draw_a_card {
    public static void main(String args[]){
       draw(15);
    }
    public static void draw(int n){
        int baodi_four=0;//保底即当抽10次必会抽中一个四星角色
        for (int i = 0; i < n; i++) {
            String role_five[]={"雷神","尤拉","七七","莫娜","刻琴"};
            String role_four[]={"香菱","凝光","砂糖","班尼特","行秋"};
            int chouka=(int)(Math.random()*1000);//生成一个0到1000的随机数即表示抽到一个的概率为千分之一
            if (baodi_four==9){
                int four=(int)(Math.random()*role_four.length);//生成一个0-5的随机数即当baodi_four=9让他抽中
                System.out.println("恭喜你抽到四星角色"+role_four[four]);//随机输出一个四星角色
                baodi_four=0;//如果baodi_four！=0,那么当它=9时，就会反复执行第11行代码
            }
            else {
                if(chouka<6){//<6即如果概率达到千分之六就中一个五星角色
                    int five=(int)(Math.random()*role_five.length);//中五星角色
                    System.out.println("恭喜你抽到五星角色"+role_five[five]);

                }
                else if (chouka<66){//同理
                    int four=(int)(Math.random()*role_four.length);
                    System.out.println("恭喜你抽到四星角色"+role_four[four]);
                    baodi_four=0;
                }
                else{
                    System.out.println("恭喜你抽到狗粮");
                    baodi_four++;
                }
            }
        }
    }
}
