import java.util.*;
public class List {
	public int data;
	public List next;
	List()
	{
		data=0; next=null;
	}
	List(int data, List next)
	{
		this.data=data; this.next=null;
	}
	List(int data)
	{
		this.data=data;
		next=null;
	}
	public static List insert(List head, int key)
	{
		List temp= new List(key, null);
		List temp1=null;
		if(head==null)
			head=temp;
		else
		{
			temp1=head;
			while(temp1.next!=null)
				temp1=temp1.next;
			temp1.next=temp;
		}
		return head;
	}
	public static void display(List head)
	{
		while(head!=null)
		{	
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		List head=null;
		int size= sc.nextInt();
		if(size==0)
		{
			System.out.println("List Empty!");
			return;
		}
		for(int i=0; i<size; i++)
		{
			head=insert(head, sc.nextInt());
		}
		List ptr= head, head1=null, head2=null;
		while(ptr!=null)
		{
			//traverse the list
			int x=ptr.data;
			if(x%2==0)
			{
				//even number, insert in even list
				head1= insert(head1,x);
			}
			else
			{
				//odd number, insert in odd list
				head2= insert(head2, x);
			}
			x=0;
			ptr=ptr.next;
		}
		//odd list
		if(head2==null)
			System.out.println("No odd list exists");
		else
			display(head2);
		System.out.println("");
		//even list
		if(head1==null)
		{
			System.out.println("No even list exists");
		}
		else
			display(head1);
	sc.close();
	}
}
