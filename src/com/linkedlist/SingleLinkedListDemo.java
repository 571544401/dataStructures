public class SingleLinkedListDemo{
    public static void main(String[] args) {
    	HeroSingleNode hero1 = new HeroSingleNode(1,"1","1");
    	HeroSingleNode hero2 = new HeroSingleNode(2,"2","2");
    	HeroSingleNode hero3 = new HeroSingleNode(3,"3","3");
    	SingleLinkedList list = new SingleLinkedList();
        list.addList(hero1);
        list.addList(hero2);
        list.addList(hero3);
        list.listHeroSingleNode();
        list.deleteNode(2);
        list.listHeroSingleNode();
    }
}

class SingleLinkedList{
    //定义双向链表头节点
    private HeroSingleNode head = new HeroSingleNode(0,"","");

    public HeroSingleNode getHead(){
        return head;
    }
    
    //尾部添加节点
    public void addList(HeroSingleNode hero){
    	HeroSingleNode temp = getHead();
    	while(true){
        	if(temp.next != null){
        	    temp = temp.next;	
        	}else {
        		temp.next = hero;
        		break;
        	}
    	}
    }
    
    //头部添加节点
    public void addListHead(HeroSingleNode hero){
    	HeroSingleNode temp = getHead();
    	HeroSingleNode newTemp = hero;
    	if(temp.next == null){
			temp.next = hero;
		}else {
			newTemp.next = temp.next;
			temp.next = newTemp;
		}
    }
    
    //遍历单向链表
    public void listHeroSingleNode(){
    	HeroSingleNode temp = getHead();
        while(true){
            if(temp.next == null){
                break;
            }
            if(temp.next != null){
                System.out.println(temp.next);
                temp = temp.next;
            }
        }
    }
    
    //删除指定节点
    public void deleteNode(int num){
    	HeroSingleNode temp = getHead();
    	while(true){
    		if(temp.next == null){
    			System.out.println("没有此节点");
    			break;
    		}else{
    			if(temp.next.no == num){
    				temp.next = temp.next.next;
    				break;
    			}
    			temp = temp.next;
    		}
    	}
    }
    
}

class HeroSingleNode {
    public int no;
    public String name;
    public String nickname;
    public HeroSingleNode next;
    public HeroSingleNode pre;

    public HeroSingleNode(int no,String name,String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString(){
        return "no="+no+",name="+name+",nickname="+nickname+",";
    }
}