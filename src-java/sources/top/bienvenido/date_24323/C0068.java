package top.bienvenido.date_24323;

import android.accounts.Account;
import android.os.Parcel;
import java.util.Map;

/* JADX INFO: renamed from: top.bienvenido.date_24323.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.class */
public final class C0068 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public Account f516;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public String f517;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final C0031x7011f1e3 f518;

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final C0031x7011f1e3 f519;

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public long f520xaa30c2c7;

    public C0068(Account account) {
        this.f516 = account;
        this.f518 = new C0031x7011f1e3(0);
        this.f519 = new C0031x7011f1e3(0);
    }

    public C0068(Parcel parcel) {
        Account account = (Account) parcel.readParcelable(Account.class.getClassLoader());
        Account account2 = account;
        if (account == null) {
            account2 = account;
            Account account3 = new Account(parcel);
        }
        this(account2);
        this.f517 = parcel.readString();
        Map map = (Map) parcel.readSerializable();
        if (map != null) {
            this.f518.putAll(map);
        }
        Map map2 = (Map) parcel.readSerializable();
        if (map2 != null) {
            this.f519.putAll(map2);
        }
        this.f520xaa30c2c7 = parcel.readLong();
    }
}
