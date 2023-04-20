package com.example.calculator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

class post{
    String title,description,url,urlToImage,publishedAt,name;
}
public class news1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news1);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        ArrayList<post>arr=new ArrayList<>();
        post p=new post();
        p.title="These Stocks Are Moving the Most Today: Netflix, Tesla, Western Alliance, Morgan Stanley, United Airlines, and More";
        p.description="Netflix issues a disappointing second-quarter outlook, Tesla will report earnings after the stock market closes Wednesday, and regional bank Western Alliance says deposits have stabilized.#netflix #tesla #westernalliance";
        p.url="https://biztoc.com/x/e06f2c8aad193788";
        p.urlToImage="https://c.biztoc.com/p/e06f2c8aad193788/og.webp";
        p.name="Biztoc.com";
        p.publishedAt="barrons.com";
        arr.add(p);

        post p1=new post();
        p1.title="Elon Musk: Seçimlerde yapay zeka ve dijital bilinç kullanımı demokrasiye darbe indirebilir";
        p1.description="Bileğindeki altın bileziklere Tesla, SpaceX, Twitter'ın yanısıra X.AI adlı yapay zeka şirketini de katan Musk, yapay zeka kullanımıyla ilgili uyarılarına bir yenisini ekledi.";
        p1.url="https://sputniknews.com.tr/20230419/elon-musk-secimlerde-yapay-zeka-ve-dijital-bilinc-kullanimi-demokrasiye-darbe-indirebilir-1069888460.html";
        p1.urlToImage="https://cdn1.img.sputniknews.com.tr/images/sharing/article/tur/1069888460.jpg?10698920191681894184";
        p1.name="putnik Türkiye";
        p1.publishedAt="Sputniknews.com.tr";
        arr.add(p1);

        post p2=new post();
        p2.title="Blackstone Profit Slides as Dealmaking Hit by Market Tumult";
        p2.description="Blackstone Inc.’s first-quarter profit fell as dealmaking at the world’s largest alternative-asset manager slowed in a tumultuous stretch when rising interest rates roiled markets. • None Tesla Slashes Prices of Key Models Again Ahead of Earnings • None Worth…";
        p2.url="https://biztoc.com/x/7a688e5f9ae13f06";
        p2.urlToImage="https://c.biztoc.com/p/7a688e5f9ae13f06/og.webp";
        p2.name="yahoo.com";
        p2.publishedAt="Biztoc.com";
        arr.add(p2);

        post p3=new post();
        p3.title="Stock futures sink, Tesla plummets 7%: Stock market news today";
        p3.description="U.S. stock futures traded lower headed into the market open on Thursday morning, as weaker-than-expected quarterly profit at Tesla (TSLA) weighed on electric-vehicle stocks. Futures tied to the S&P 500 (^GSPC) fell 0.62%, while futures on the Dow Jones Indust…";
        p3.url="https://biztoc.com/x/3f5096f8cd39ecf2";
        p3.urlToImage="https://c.biztoc.com/p/3f5096f8cd39ecf2/og.webp";
        p3.name="yahoo.com";
        p3.publishedAt="Biztoc.com";
        arr.add(p3);

        post p4=new post();
        p4.title="Wall St set to open lower on downbeat earnings, interest rate jitters";
        p4.description="Wall Street was set to open lower on Thursday as disappointing results from Tesla (NASDAQ: ), AT&T and some regional banks dented investor sentiment already soured by prospects of further U.S. interest rate hikes. The main U.S. stock indexes have remained ste…";
        p4.url="https://biztoc.com/x/1dbe0773f1d0d180";
        p4.urlToImage="https://c.biztoc.com/p/1dbe0773f1d0d180/og.webp";
        p4.name="Biztoc.com";
        p4.publishedAt="investing.com";
        arr.add(p4);

        post p5=new post();
        p5.title="Tesla 24% Profit Plunge And Elon Musk’s Self-Driving Delusion";
        p5.description="If a company wants to earn better than average profits, as I wrote in January, it has two choices: • Provide the industry’s most valuable product at a high price (a differentiation strategy) Selling your product at the industry average price — stuck in the mi…";
        p5.url="https://biztoc.com/x/ecffad5670800bfc";
        p5.urlToImage="https://c.biztoc.com/p/ecffad5670800bfc/og.webp";
        p5.name="Biztoc.com";
        p5.publishedAt="forbes.com";
        arr.add(p5);

        post p6=new post();
        p6.title="Recession already here for many Americans, as buying power, credit, social net shrinks - The Hill";
        p6.description="The stock market may be closely watching the chance of an official economic recession, but many Americans across the country are already feeling the squeeze as they contend with higher prices and borrowing costs than they saw a year ago. While Evelyn Canela, …";
        p6.url="https://thehill.com/homenews/3951579-recession-already-here-for-many-americans-as-buying-power-credit-social-net-shrinks/";
        p6.urlToImage="https://thehill.com/wp-content/uploads/sites/2/2020/09/foodbank09112020.jpg?w=1280";
        p6.name="The Hill";
        p6.publishedAt="Aris Folley";
        arr.add(p6);

        post p7=new post();
        p7.title="UK inflation is just not going down as cost of living crisis offers 'no respite' - CNBC";
        p7.description="U.K. inflation remained stubbornly in double digits in March, driven largely by soaring food prices, as the country's cost-of-living crisis showed little sign of abating.";
        p7.url="https://www.cnbc.com/2023/04/20/uk-inflation-is-just-not-going-down-as-cost-of-living-crisis-offers-no-respite.html";
        p7.urlToImage="https://image.cnbcfm.com/api/v1/image/107228374-1681968260524-GettyImages-1250082526.jpg?v=1681982418&w=1920&h=1080";
        p7.name="CNBC";
        p7.publishedAt="Elliot Smith";
        arr.add(p7);

        post p8=new post();
        p8.title="Apple’s 'Tetris' movie trades real-life drama for spy fantasies";
        p8.description="No, the origins of Tetris didn't involve a high-speed car chase, but the true story behind the game still reads like a spy novel. There's corporate intrigue, nefarious government agencies and an envious amount of globe-trotting. But the reality wasn't enough …";
        p8.url="https://www.engadget.com/apple-tetris-movie-review-123020220.html";
        p8.urlToImage="https://s.yimg.com/uu/api/res/1.2/m7xFIHyrn_FltfzYfmVUMw--~B/Zmk9ZmlsbDtoPTYzMDtweW9mZj0wO3c9MTIwMDthcHBpZD15dGFjaHlvbg--/https://media-mbst-pub-ue1.s3.amazonaws.com/creatr-uploaded-images/2023-03/a37d85b1-ce63-11ed-977c-3e12cc6822ed.cf.jpg";
        p8.name="Engadget";
        p8.publishedAt="Devindra Hardawar";
        arr.add(p8);

        post p9=new post();
        p9.title="The Super Mario Bros. Movie’ is already the biggest game adaptation of all time";
        p9.description="The Super Mario Bros. Movie has only been in theaters for a week and a half, but it's been pulverizing box office records faster than Nintendo's mascot can run from left to right. It already had the highest-grossing opening weekend for any video game-base…";
        p9.url="https://www.engadget.com/the-super-mario-bros-movie-is-already-the-biggest-game-adaptation-of-all-time-173946909.html";
        p9.urlToImage="https://s.yimg.com/uu/api/res/1.2/Mbmy2T.w91TSqRvFhLLy9Q--~B/Zmk9ZmlsbDtoPTYzMDtweW9mZj0wO3c9MTIwMDthcHBpZD15dGFjaHlvbg--/https://media-mbst-pub-ue1.s3.amazonaws.com/creatr-uploaded-images/2023-04/a4bb8ab0-daea-11ed-94f9-5c4f39a1e573.cf.jpg";
        p9.name="Engadget";
        p9.publishedAt="Kris Holt";
        arr.add(p9);
         int[] i = {0};
        int n=arr.size()-1;

        TextView textView= findViewById(R.id.title);
        TextView textView1= findViewById(R.id.textView8);
        TextView textView2= findViewById(R.id.textView10);
        TextView textView3= findViewById(R.id.textView9);
        ImageView imageView=findViewById(R.id.imageView2);
        Button button=findViewById(R.id.button);
        Button button1=findViewById(R.id.button3);
        Button button2=findViewById(R.id.button4);

        textView.setText(arr.get(i[0]).title);
        textView1.setText(arr.get(i[0]).description);
        textView2.setText(arr.get(i[0]).publishedAt);
        textView3.setText(arr.get(i[0]).name);
        Glide.with(this).load(arr.get(i[0]).urlToImage).into(imageView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(arr.get(i[0]).url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i[0] !=0){
                    i[0]--;
                    textView.setText(arr.get(i[0]).title);
                    textView1.setText(arr.get(i[0]).description);
                    textView2.setText(arr.get(i[0]).publishedAt);
                    textView3.setText(arr.get(i[0]).name);
                    Glide.with(view.getContext()).load(arr.get(i[0]).urlToImage).into(imageView);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i[0] !=n){
                    ++i[0];
                    textView.setText(arr.get(i[0]).title);
                    textView1.setText(arr.get(i[0]).description);
                    textView2.setText(arr.get(i[0]).publishedAt);
                    textView3.setText(arr.get(i[0]).name);
                    Glide.with(view.getContext()).load(arr.get(i[0]).urlToImage).into(imageView);
                }
            }
        });
//
    }
}