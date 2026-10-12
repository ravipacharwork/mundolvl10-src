package top.bienvenido.date_24323;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/q0.class */
public final class q0 implements s0 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f278;

    public q0(IBinder iBinder) {
        this.f278 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f278;
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Intent mo328(IBinder iBinder, Intent intent, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoWindowManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f278.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Intent) (parcelObtain2.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */
    public final void mo334xb7bf1d91(String str, String str2) {
        Parcel Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoWindowManagerService");
            Obtain.writeString(str);
            Obtain.writeString(str2);
            this.f278.transact(7, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
                        throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */
    public final void mo335(IBinder iBinder) {
        Parcel Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoWindowManagerService");
            Obtain.writeStrongBinder(iBinder);
            this.f278.transact(8, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
                        throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第 */
    public final String mo340(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoWindowManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            this.f278.transact(13, parcelObtain, Obtain, 0);
            Obtain.readException();
            String strVal = Obtain.readString();
            Obtain.recycle();
            parcelObtain.recycle();
            return strVal;
        } catch (Throwable th) {
            Obtain.recycle();
                        throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final boolean mo341(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoWindowManagerService");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f278.transact(14, parcelObtain, Obtain, 0);
            Obtain.readException();
            int intVal = Obtain.readInt();
            boolean z = intVal != 0;
            Obtain.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            Obtain.recycle();
                        throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final void mo342xaa30c2c7(String str, String str2) {
        Parcel Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoWindowManagerService");
            Obtain.writeString(str);
            Obtain.writeString(str2);
            this.f278.transact(15, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
                        throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */
    public final boolean mo343(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoWindowManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            this.f278.transact(16, parcelObtain, Obtain, 0);
            Obtain.readException();
            int intVal = Obtain.readInt();
            boolean z = intVal != 0;
            Obtain.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            Obtain.recycle();
                        throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final void mo344(String str) {
        Parcel Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoWindowManagerService");
            Obtain.writeString(str);
            this.f278.transact(17, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
                        throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final boolean mo346() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoWindowManagerService");
            this.f278.transact(19, parcelObtain, Obtain, 0);
            Obtain.readException();
            int intVal = Obtain.readInt();
            boolean z = intVal != 0;
            Obtain.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            Obtain.recycle();
                        throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.Intent[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Intent[] mo329(IBinder iBinder, Intent[] intentArr, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoWindowManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeTypedArray(intentArr, 0);
            parcelObtain.writeInt(i);
            this.f278.transact(2, parcelObtain, Obtain, 0);
            Obtain.readException();
            Intent[] obsVal = Obtain.createTypedArray(Intent.CREATOR);
            Obtain.recycle();
            parcelObtain.recycle();
            return obsVal;
        } catch (Throwable th) {
            Obtain.recycle();
                        throw th;
        }
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo330(Intent intent, String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoWindowManagerService");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            this.f278.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Intent mo331(long j, Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoWindowManagerService");
            parcelObtain.writeLong(j);
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f278.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Intent) (parcelObtain2.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo332(IBinder iBinder, IBinder iBinder2) {
        Parcel Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoWindowManagerService");
            Obtain.writeStrongBinder(iBinder);
            Obtain.writeStrongBinder(iBinder2);
            this.f278.transact(5, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
                        throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final List mo336(long j) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoWindowManagerService");
            parcelObtain.writeLong(j);
            this.f278.transact(9, parcelObtain, Obtain, 0);
            Obtain.readException();
            ArrayList listVal = Obtain.createTypedArrayList(ActivityManager.RunningTaskInfo.CREATOR);
            Obtain.recycle();
            parcelObtain.recycle();
            return listVal;
        } catch (Throwable th) {
            Obtain.recycle();
                        throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final List mo337(long j, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoWindowManagerService");
            parcelObtain.writeLong(j);
            parcelObtain.writeInt(i);
            this.f278.transact(10, parcelObtain, Obtain, 0);
            Obtain.readException();
            ArrayList listVal = Obtain.createTypedArrayList(ActivityManager.RecentTaskInfo.CREATOR);
            Obtain.recycle();
            parcelObtain.recycle();
            return listVal;
        } catch (Throwable th) {
            Obtain.recycle();
                        throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo338(IBinder iBinder, String str, String str2, String str3, int i) {
        Parcel Obtain = Parcel.obtain();
        Parcel parcelObtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoWindowManagerService");
            Obtain.writeStrongBinder(iBinder);
            Obtain.writeString(str);
            Obtain.writeString(str2);
            Obtain.writeString(str3);
            Obtain.writeInt(i);
            this.f278.transact(11, Obtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            Obtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
                        throw th;
        }
    }

    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final ComponentName mo339(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoWindowManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            this.f278.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ComponentName) (parcelObtain2.readInt() != 0 ? ComponentName.CREATOR.createFromParcel(parcelObtain2) : null);
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
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final String mo345() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoWindowManagerService");
            this.f278.transact(18, parcelObtain, Obtain, 0);
            Obtain.readException();
            String strVal = Obtain.readString();
            Obtain.recycle();
            parcelObtain.recycle();
            return strVal;
        } catch (Throwable th) {
            Obtain.recycle();
                        throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.s0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo347(String str) {
        Parcel Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoWindowManagerService");
            Obtain.writeString(str);
            this.f278.transact(20, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
                        throw th;
        }
    }
}
