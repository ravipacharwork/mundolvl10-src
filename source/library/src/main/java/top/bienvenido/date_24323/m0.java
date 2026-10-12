package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/m0.class */
public final class m0 implements p0 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f221;

    public m0(IBinder iBinder) {
        this.f221 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f221;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样, reason: contains not printable characters */
    public final boolean mo263x541a43c1(String str) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeString(str);
            this.f221.transact(1, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.readInt();
            boolean z = Obtain != 0;
            Obtain.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final boolean mo264(String str) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeString(str);
            this.f221.transact(2, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.readInt();
            boolean z = Obtain != 0;
            Obtain.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final PackageInfo mo265(String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f221.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (PackageInfo) (parcelObtain2.readInt() != 0 ? PackageInfo.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final ApplicationInfo mo266(String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f221.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ApplicationInfo) (parcelObtain2.readInt() != 0 ? ApplicationInfo.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public final ServiceInfo mo269xaa30c2c7(ComponentName componentName) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            if (componentName != null) {
                parcelObtain.writeInt(1);
                componentName.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f221.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ServiceInfo) (parcelObtain2.readInt() != 0 ? ServiceInfo.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final List mo272(Intent intent, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f221.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public final List mo276(Intent intent, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f221.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第, reason: contains not printable characters */
    public final ProviderInfo mo277(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeString(str);
            this.f221.transact(17, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ProviderInfo) (parcelObtain2.readInt() != 0 ? ProviderInfo.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化, reason: contains not printable characters */
    public final String mo278x4f52efc(String str) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeString(str);
            this.f221.transact(19, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.readString();
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public final void mo279(String str) {
        ?? Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoPackageManagerService");
            Obtain.writeString(str);
            this.f221.transact(20, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 说话不过脑子直接从您屁眼里崩出来, reason: contains not printable characters */
    public final int mo280(String str) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeString(str);
            this.f221.transact(21, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.readInt();
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈, reason: contains not printable characters */
    public final String[] mo281xb7bf1d91(int i) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeInt(i);
            this.f221.transact(22, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.createStringArray();
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public final ArrayList mo2985(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f221.transact(18, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.createTypedArrayList(ProviderInfo.CREATOR);
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final ActivityInfo mo268(ComponentName componentName) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            if (componentName != null) {
                parcelObtain.writeInt(1);
                componentName.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f221.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ActivityInfo) (parcelObtain2.readInt() != 0 ? ActivityInfo.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈, reason: contains not printable characters */
    public final String[] mo288xb7bf1d91(String str) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeString(str);
            this.f221.transact(29, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.createStringArray();
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第, reason: contains not printable characters */
    public final void mo286(String str, String str2) {
        ?? Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoPackageManagerService");
            Obtain.writeString(str);
            Obtain.writeString(str2);
            this.f221.transact(27, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final ActivityInfo mo267(ComponentName componentName) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            if (componentName != null) {
                parcelObtain.writeInt(1);
                componentName.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f221.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ActivityInfo) (parcelObtain2.readInt() != 0 ? ActivityInfo.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final ProviderInfo mo270(ComponentName componentName) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            if (componentName != null) {
                parcelObtain.writeInt(1);
                componentName.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f221.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ProviderInfo) (parcelObtain2.readInt() != 0 ? ProviderInfo.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final String mo282(int i) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeInt(i);
            this.f221.transact(23, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.readString();
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public final int mo284(String str) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeString(str);
            this.f221.transact(25, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.readInt();
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public final ResolveInfo mo274xaa30c2c7(Intent intent, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f221.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ResolveInfo) (parcelObtain2.readInt() != 0 ? ResolveInfo.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈, reason: contains not printable characters */
    public final void mo289xb7bf1d91() {
        ?? Obtain = Parcel.obtain();
        Parcel parcelObtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoPackageManagerService");
            this.f221.transact(30, Obtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            Obtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final String[] mo283(int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeIntArray(iArr);
            this.f221.transact(24, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.createStringArray();
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final ResolveInfo mo273(Intent intent, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f221.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ResolveInfo) (parcelObtain2.readInt() != 0 ? ResolveInfo.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final List mo271(Intent intent, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f221.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final List mo275(Intent intent, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f221.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public final ArrayList mo297xaa30c2c7(int i) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeInt(i);
            this.f221.transact(16, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.createTypedArrayList(ApplicationInfo.CREATOR);
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final int mo285(String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f221.transact(26, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.readInt();
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public final boolean mo292xaa30c2c7(String str) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeString(str);
            this.f221.transact(34, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.readInt();
            boolean z = Obtain != 0;
            Obtain.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final boolean mo290(String str) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeString(str);
            this.f221.transact(31, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.readInt();
            boolean z = Obtain != 0;
            Obtain.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final ArrayList mo296(int i) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            parcelObtain.writeInt(i);
            this.f221.transact(15, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.createTypedArrayList(PackageInfo.CREATOR);
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo293(List list) {
        ?? Obtain = Parcel.obtain();
        Parcel parcelObtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoPackageManagerService");
            o0.m391(Obtain, list, 0);
            this.f221.transact(35, Obtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            Obtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final void mo287(String str, String str2) {
        ?? Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoPackageManagerService");
            Obtain.writeString(str);
            Obtain.writeString(str2);
            this.f221.transact(28, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final ArrayList mo299() {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            this.f221.transact(32, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.createStringArrayList();
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo294(ComponentName componentName, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            if (componentName != null) {
                parcelObtain.writeInt(1);
                componentName.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeInt(i);
            this.f221.transact(36, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final void mo291(int i) {
        ?? Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoPackageManagerService");
            Obtain.writeInt(i);
            this.f221.transact(33, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final int mo295(ComponentName componentName) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoPackageManagerService");
            if (componentName != null) {
                parcelObtain.writeInt(1);
                componentName.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f221.transact(37, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
