/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import top.bienvenido.date_24323.n6;
import top.bienvenido.date_24323.s0;

public abstract class r0
extends Binder
implements s0 {
    public static final /* synthetic */ int \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;

    public r0() {
        r0 r02 = this;
        r02.attachInterface(this, "MundoWindowManagerService");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int n10, Parcel parcel, Parcel parcel2, int n11) {
        String string = "MundoWindowManagerService";
        if (n10 >= 1 && n10 <= 0xFFFFFF) {
            parcel.enforceInterface(string);
        }
        if (n10 == 1598968902) {
            parcel2.writeString(string);
            return true;
        }
        switch (n10) {
            default: {
                Object object2;
                return super.onTransact(n10, parcel, parcel2, n11);
            }
            case 20: {
                parcel.readString();
                break;
            }
            case 19: {
                Object object2;
                int n12 = ((n6)object2).\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988();
                parcel2.writeNoException();
                parcel2.writeInt(n12);
                break;
            }
            case 18: {
                Object object2;
                String string2 = ((n6)object2).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070();
                parcel2.writeNoException();
                parcel2.writeString(string2);
                break;
            }
            case 17: {
                Object object2;
                r0 r02 = object2;
                object2 = parcel.readString();
                ((n6)r02).\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988((String)object2);
                break;
            }
            case 16: {
                Object object2;
                r0 r03 = object2;
                object2 = parcel.readStrongBinder();
                int n13 = ((n6)r03).\u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403((IBinder)object2);
                parcel2.writeNoException();
                parcel2.writeInt(n13);
                break;
            }
            case 15: {
                Object object2;
                r0 r04 = object2;
                object2 = parcel.readString();
                String string3 = parcel.readString();
                ((n6)r04).\u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a((String)object2, string3);
                break;
            }
            case 14: {
                Object object2;
                r0 r05 = object2;
                object2 = parcel.readString();
                String string4 = parcel.readString();
                int n14 = ((n6)r05).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403((String)object2, string4);
                parcel2.writeNoException();
                parcel2.writeInt(n14);
                break;
            }
            case 13: {
                Object object2;
                r0 r06 = object2;
                object2 = parcel.readStrongBinder();
                String string3 = ((n6)r06).\u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c((IBinder)object2);
                parcel2.writeNoException();
                parcel2.writeString(string3);
                break;
            }
            case 12: {
                Object object2;
                r0 r07 = object2;
                object2 = parcel.readStrongBinder();
                object2 = ((n6)r07).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((IBinder)object2);
                parcel2.writeNoException();
                n10 = 1;
                if (object2 != null) {
                    parcel2.writeInt(1);
                    object2.writeToParcel(parcel2, n10);
                    break;
                }
                parcel2.writeInt(0);
                break;
            }
            case 11: {
                Object object2;
                r0 r08 = object2;
                object2 = parcel.readStrongBinder();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                string = parcel.readString();
                int n15 = parcel.readInt();
                ((n6)r08).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((IBinder)object2, string6, string7, string, n15);
                parcel2.writeNoException();
                break;
            }
            case 10: {
                Object object2;
                long l10 = parcel.readLong();
                int n16 = parcel.readInt();
                List list = ((n6)object2).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(l10, n16);
                parcel2.writeNoException();
                n10 = 1;
                if (list == null) {
                    parcel2.writeInt(-1);
                    break;
                }
                n16 = list.size();
                parcel2.writeInt(n16);
                for (n11 = 0; n11 < n16; ++n11) {
                    string = (Parcelable)list.get(n11);
                    if (string != null) {
                        parcel2.writeInt(1);
                        string.writeToParcel(parcel2, n10);
                        continue;
                    }
                    parcel2.writeInt(0);
                }
                break;
            }
            case 9: {
                Object object2;
                long l11 = parcel.readLong();
                List list = ((n6)object2).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(l11);
                parcel2.writeNoException();
                n10 = 1;
                if (list == null) {
                    parcel2.writeInt(-1);
                    break;
                }
                int n17 = list.size();
                parcel2.writeInt(n17);
                for (n11 = 0; n11 < n17; ++n11) {
                    string = (Parcelable)list.get(n11);
                    if (string != null) {
                        parcel2.writeInt(1);
                        string.writeToParcel(parcel2, n10);
                        continue;
                    }
                    parcel2.writeInt(0);
                }
                break;
            }
            case 8: {
                Object object2;
                r0 r09 = object2;
                object2 = parcel.readStrongBinder();
                ((n6)r09).\u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f((IBinder)object2);
                break;
            }
            case 7: {
                Object object2 = parcel.readString();
                n6.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(null, parcel.readString(), (String)object2);
                break;
            }
            case 6: {
                Object object2;
                r0 r010 = object2;
                object2 = parcel.readString();
                String string8 = parcel.readString();
                int n15 = ((n6)r010).\u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f((String)object2, string8);
                parcel2.writeNoException();
                parcel2.writeInt(n15);
                break;
            }
            case 5: {
                Object object2;
                r0 r011 = object2;
                object2 = parcel.readStrongBinder();
                IBinder iBinder = parcel.readStrongBinder();
                ((n6)r011).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((IBinder)object2, iBinder);
                break;
            }
            case 4: {
                Object object2;
                long l12 = parcel.readLong();
                Parcelable.Creator creator = Intent.CREATOR;
                creator = (Intent)(parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
                object2 = ((n6)object2).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(l12, (Intent)creator);
                parcel2.writeNoException();
                int n19 = 1;
                if (object2 != null) {
                    parcel2.writeInt(1);
                    object2.writeToParcel(parcel2, n19);
                    break;
                }
                parcel2.writeInt(0);
                break;
            }
            case 3: {
                Object object2;
                Parcelable.Creator creator = Intent.CREATOR;
                Object object = object2;
                object2 = parcel.readString();
                ((n6)object).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Intent)(parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null), (String)object2);
                break;
            }
            case 2: {
                Object object2;
                r0 r012 = object2;
                object2 = parcel.readStrongBinder();
                Intent[] intentArray = (Intent[])parcel.createTypedArray(Intent.CREATOR);
                int n20 = parcel.readInt();
                Intent[] intentArray2 = ((n6)r012).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((IBinder)object2, intentArray, n20);
                parcel2.writeNoException();
                parcel2.writeTypedArray((Parcelable[])intentArray2, 1);
                break;
            }
            case 1: {
                Object object2;
                IBinder iBinder = parcel.readStrongBinder();
                Parcelable.Creator creator = Intent.CREATOR;
                creator = (Intent)(parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
                int n21 = parcel.readInt();
                boolean bl = parcel.readInt() != 0;
                object2 = ((n6)object2).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(iBinder, (Intent)creator, n21, bl);
                parcel2.writeNoException();
                int n22 = 1;
                if (object2 != null) {
                    parcel2.writeInt(1);
                    object2.writeToParcel(parcel2, n22);
                    break;
                }
                parcel2.writeInt(0);
            }
        }
        return true;
    }
}

