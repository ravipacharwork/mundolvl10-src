/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package top.bienvenido.date_24323;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import top.bienvenido.date_24323.i0;
import top.bienvenido.date_24323.q4;

public abstract class h0
extends Binder
implements i0 {
    public static final /* synthetic */ int \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;

    public h0() {
        h0 h02 = this;
        h02.attachInterface(this, "MundoContentService");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int n10, Parcel parcel, Parcel parcel2, int n11) {
        String string = "MundoContentService";
        if (n10 >= 1 && n10 <= 0xFFFFFF) {
            parcel.enforceInterface(string);
        }
        if (n10 == 1598968902) {
            parcel2.writeString(string);
            return true;
        }
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    return super.onTransact(n10, parcel, parcel2, n11);
                }
                Parcelable.Creator creator = Uri.CREATOR;
                creator = (Uri)(parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
                Parcel parcel3 = parcel;
                parcel = parcel3.readStrongBinder();
                n11 = parcel3.readInt() != 0 ? 1 : 0;
                ((q4)this).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Uri)creator, (IBinder)parcel, n11 != 0);
                parcel2.writeNoException();
            } else {
                h0 h02 = this;
                this = parcel.readStrongBinder();
                ((q4)h02).\u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a((IBinder)this);
                parcel2.writeNoException();
            }
        } else {
            Parcelable.Creator creator = Uri.CREATOR;
            creator = (Uri)(parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
            n11 = parcel.readInt() != 0 ? 1 : 0;
            h0 h03 = this;
            this = parcel.readStrongBinder();
            ((q4)h03).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403((Uri)creator, (IBinder)this, n11 != 0);
            parcel2.writeNoException();
        }
        return true;
    }
}

