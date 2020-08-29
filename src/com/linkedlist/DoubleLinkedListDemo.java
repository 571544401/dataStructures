public class DoubleLinkedListDemo{
    public static void main(String[] args) {
    	HeroDoubleNode hero1 = new HeroDoubleNode(1,"1","1");
    	HeroDoubleNode hero2 = new HeroDoubleNode(2,"2","2");
    	HeroDoubleNode hero3 = new HeroDoubleNode(3,"3","3");
        DoubleLinkedList list = new DoubleLinkedList();
        list.addList(hero1);
        list.addList(hero2);
        list.addList(hero3);
        list.listHeroDoubleNode();
    }
}

class DoubleLinkedList{
    //定义双向链表头节点
    private HeroDoubleNode head = new HeroDoubleNode(0,"","");

    public HeroDoubleNode getHead(){
        return head;
    }
    
    //尾部添加节点
    public void addList(HeroDoubleNode hero){
    	HeroDoubleNode temp = getHead();
    	while(true){
        	if(temp.next != null){
        	    temp = temp.next;	
        	}else {
        		temp.next = hero;
        		break;
        	}
    	}
    }
    
    //遍历双向链表
    public void listHeroDoubleNode(){
        HeroDoubleNode temp = getHead();
        while(true){
            if(temp.next == null){
                System.out.println(temp);
                break;
            }
            if(temp.next != null){
                System.out.println(temp);
                temp = temp.next;
            }
        }
    }
}

class HeroDoubleNode {
    public int no;
    public String name;
    public String nickname;
    public HeroDoubleNode next;
    public HeroDoubleNode pre;

    public HeroDoubleNode(int no,String name,String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString(){
        return "no="+no+",name="+name+",nickname="+nickname+",";
    }
}