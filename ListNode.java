
class ListNode
{
	char char1;
	ListNode next;

	ListNode( char char1 )
	{
		this( char1, null );
	} 
	
	ListNode( char char1, ListNode node )
	{
		this.char1 = char1;
		next = node;
	}

	char getchar()
	
	{
		return char1; 
	}

} 