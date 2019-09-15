std::ios::sync_with_stdio(false);
	long long l,r;
		cin>>l>>r;
		ll mx=2e9,mx1=2e9;
		ll l1=l%2019,rr=r%2019;
		if(l1>=rr||r-l>=2019){
			for(ll i=l1;i<2019;i++)
				for(ll j=i+1;j<2019;j++)
					mx1=min(mx1,(i*j)%2019);
			for(ll i=0;i<=rr;i++)
				for(ll j=i+1;j<=rr;j++)
					mx1=min(mx1,(i*j)%2019);
		}
		else{
			for(ll i=l1;i<=rr;i++)
				for(ll j=i+1;j<=rr;j++)
					mx1=min(mx1,(1ll*i*j)%2019);
		}
		cout<<mx1<<"\n";

————————————————
版权声明：本文为CSDN博主「白驼山欧阳锋」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/bailichuan266/article/details/95042235
