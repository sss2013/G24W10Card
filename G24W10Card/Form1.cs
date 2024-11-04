namespace G24W10Card
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

  

        private void Card_Deal_Click(object sender, EventArgs e)
        {
            string[] suits = ["spades", "hearts", "diamonds", "clubs"];
            string[] values = ["Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"];
            
            Random random= new Random();
            int card = random.Next(suits.Length*values.Length);

            string suit = suits[card / values.Length];
            string value = values[card % values.Length];


            Bitmap? bmp = Properties.Resources
                .ResourceManager.GetObject($"{value}_of_{suit}")
                as Bitmap;
            Card1.Image = bmp as Image;

        }
    }
}
