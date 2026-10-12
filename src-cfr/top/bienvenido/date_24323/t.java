/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Process
 */
package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import top.bienvenido.date_24323.a5;
import top.bienvenido.date_24323.h6;
import top.bienvenido.date_24323.u;

public abstract class t
extends Binder
implements u {
    public static final /* synthetic */ int \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;

    public t() {
        t t10 = this;
        t10.attachInterface(this, "MundoAppThread");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int n10, Parcel parcel, Parcel object, int n11) {
        String string = "MundoAppThread";
        if (n10 >= 1 && n10 <= 0xFFFFFF) {
            parcel.enforceInterface(string);
        }
        if (n10 == 1598968902) {
            object.writeString(string);
            return true;
        }
        switch (n10) {
            default: {
                return super.onTransact(n10, parcel, object, n11);
            }
            case 9: {
                t t10 = object2;
                Object object2 = parcel.readString();
                ((h6)t10).\u5b59\u7acb\u519b\u7981\u64ad\u4f60\u5988\u4e0b\u4f53\u4e43\u662f\u6b63\u4e49\u4e4b\u4e3e\u6b64\u4e3e\u5f15\u5f97\u65e0\u6570\u7231\u56fd\u4eba\u58eb\u51b2\u8fdb\u4f60\u5988\u4e0b\u4f53\u4e00\u987f\u6253\u7838\u4ece\u6b64\u4f60\u5988\u5356\u903c\u4e5f\u6ca1\u7528\u597d\u53e3\u7891\u4e86((String)object2);
                break;
            }
            case 8: {
                Object object2 = parcel.readStrongBinder();
                String string2 = parcel.readString();
                object = Intent.CREATOR;
                parcel = (Intent)(parcel.readInt() != 0 ? object.createFromParcel(parcel) : null);
                if (string2 != null) {
                    a5.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Intent)parcel, string2);
                    break;
                }
                a5.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((IBinder)object2, (Intent)parcel);
                break;
            }
            case 7: {
                Parcel parcel2 = object;
                t t11 = object2;
                Object object2 = parcel.readString();
                object2 = ((h6)t11).\u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6((String)object2);
                parcel2.writeNoException();
                parcel2.writeStrongBinder((IBinder)object2);
                break;
            }
            case 6: {
                Process.killProcess((int)Process.myPid());
                break;
            }
            case 5: {
                t t12 = object2;
                Object object2 = parcel.readStrongBinder();
                ((h6)t12).\u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988((IBinder)object2);
                break;
            }
            case 4: {
                IBinder iBinder = parcel.readStrongBinder();
                object = parcel.readString();
                n11 = parcel.readInt();
                string = Intent.CREATOR;
                parcel = (Intent)(parcel.readInt() != 0 ? string.createFromParcel(parcel) : null);
                ((h6)object2).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((String)object, (Intent)parcel, iBinder, n11);
                break;
            }
            case 3: {
                IBinder iBinder = parcel.readStrongBinder();
                object = Intent.CREATOR;
                parcel = (Intent)(parcel.readInt() != 0 ? object.createFromParcel(parcel) : null);
                ((h6)object2).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(iBinder, (Intent)parcel);
                break;
            }
            case 2: {
                IBinder iBinder = parcel.readStrongBinder();
                object = Intent.CREATOR;
                parcel = (Intent)(parcel.readInt() != 0 ? object.createFromParcel(parcel) : null);
                ((h6)object2).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(iBinder, (Intent)parcel);
                break;
            }
            case 1: {
                String string3 = parcel.readString();
                object = parcel.readString();
                String string4 = parcel.readString();
                boolean bl = parcel.readInt() != 0;
                Object object3 = object2;
                Object object2 = parcel.readString();
                ((h6)object3).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(string3, (String)object, string4, bl, (String)object2);
            }
        }
        return true;
    }
}

