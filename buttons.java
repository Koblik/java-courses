import javax.swing.* ;
class Buttons extends JFrame
{
	JPanel pnl = new JPanel( ) ;
	ImageIcon tick = new ImageIcon( "tick.png" ) ;
	ImageIcon cross = new ImageIcon( "cross.png" ) ;
	JButton btn = new JButton( "����� ����" ) ;
	JButton tickBtn = new JButton( tick ) ;
	JButton crossBtn = new JButton( "����" , cross ) ;
	public Buttons()
		{
		super( "O��� Swing" ) ;
		setSize( 500 , 200 ) ;
		setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
		add( pnl ) ;
		setVisible( true ) ;
		pnl.add( btn ) ;
		pnl.add( tickBtn ) ;
		pnl.add( crossBtn ) ;
		}
	public static void main ( String[] args ) 
	{ 
	Buttons gui = new Buttons() ;
	}
}