/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.pm.ProviderInfo
 *  android.os.BadParcelableException
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import top.bienvenido.date_24323.e0;
import top.bienvenido.date_24323.f0;
import top.bienvenido.date_24323.n6;
import top.bienvenido.date_24323.u5;
import top.bienvenido.date_24323.w3;

public abstract class d0
extends Binder
implements f0 {
    public static final /* synthetic */ int \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;

    public d0() {
        d0 d02 = this;
        d02.attachInterface(this, "MundoActivityManagerService");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int n10, Parcel object, Parcel parcel, int n11) {
        int n12;
        block26: {
            int n13;
            block27: {
                String string = "MundoActivityManagerService";
                if (n10 >= 1 && n10 <= 0xFFFFFF) {
                    object.enforceInterface(string);
                }
                if (n10 == 1598968902) {
                    parcel.writeString(string);
                    return true;
                }
                switch (n10) {
                    default: {
                        Object object2;
                        return super.onTransact(n10, (Parcel)object, parcel, n11);
                    }
                    case 19: {
                        Object object2;
                        d0 d02 = object2;
                        object2 = object.readString();
                        String string2 = object.readString();
                        object = object.readString();
                        ((w3)d02).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((String)object2, string2, (String)object);
                        parcel.writeNoException();
                        break;
                    }
                    case 18: {
                        Object object2;
                        d0 d03 = object2;
                        object2 = object.readString();
                        ((w3)d03).\u8001\u5b50\u5b9e\u5728\u770b\u4e0d\u8fc7\u4f60\u5988\u7684\u8111\u6b8b\u72d7\u903c\u6837\u5b50\u76f4\u63a5\u628a\u4f60\u5988\u75285\u6bdb\u94b1\u5356\u5230\u57c3\u585e\u4fc4\u6bd4\u4e9a\u56fd\u5bb6\u5927\u5993\u9662\u8bf7\u90a3\u4e9b\u975e\u6d32\u90e8\u843d\u5c0f\u55bd\u5570\u6765\u4eab\u53d7\u4f60\u5988\u903c\u7684\u9ed1\u9634\u903c((String)object2);
                        parcel.writeNoException();
                        break;
                    }
                    case 17: {
                        Object object2;
                        d0 d04 = object2;
                        object2 = (Intent)e0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)object, Intent.CREATOR);
                        String string3 = object.readString();
                        IBinder iBinder = ((w3)d04).\u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403((Intent)object2, string3);
                        parcel.writeNoException();
                        parcel.writeStrongBinder(iBinder);
                        break;
                    }
                    case 16: {
                        u5.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070();
                        break;
                    }
                    case 15: {
                        Object object2 = object.readString();
                        int n14 = n6.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f(object.readString(), (String)object2);
                        parcel.writeNoException();
                        parcel.writeInt(n14);
                        break;
                    }
                    case 14: {
                        Object object2;
                        d0 d05 = object2;
                        object2 = object.readString();
                        String string4 = object.readString();
                        ((w3)d05).\u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403((String)object2, string4);
                        break;
                    }
                    case 13: {
                        Object object2;
                        d0 d06 = object2;
                        object2 = (Intent)e0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)object, Intent.CREATOR);
                        String string5 = object.readString();
                        int n15 = ((w3)d06).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403((Intent)object2, string5);
                        parcel.writeNoException();
                        parcel.writeInt(n15);
                        break;
                    }
                    case 12: {
                        Object object2;
                        d0 d07 = object2;
                        object2 = object.readStrongBinder();
                        ((w3)d07).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403((IBinder)object2);
                        break;
                    }
                    case 11: {
                        Object object2;
                        n10 = object.readInt();
                        parcel = object.readStrongBinder();
                        Parcelable.Creator creator = IntentFilter.CREATOR;
                        object = (IntentFilter)(object.readInt() != 0 ? creator.createFromParcel((Parcel)object) : null);
                        ((w3)object2).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(n10, (IBinder)parcel, (IntentFilter)object);
                        break;
                    }
                    case 10: {
                        Object object2;
                        int n16 = object.readInt();
                        String[] stringArray = ((w3)object2).\u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403(n16);
                        parcel.writeNoException();
                        parcel.writeStringArray(stringArray);
                        break;
                    }
                    case 9: {
                        Object object2;
                        int n17 = object.readInt();
                        ArrayList arrayList = ((w3)object2).\u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f(n17);
                        parcel.writeNoException();
                        n10 = 1;
                        int n18 = arrayList.size();
                        parcel.writeInt(n18);
                        for (n11 = 0; n11 < n18; ++n11) {
                            string = (Parcelable)arrayList.get(n11);
                            if (string != null) {
                                parcel.writeInt(1);
                                string.writeToParcel(parcel, n10);
                                continue;
                            }
                            parcel.writeInt(0);
                        }
                        break;
                    }
                    case 8: {
                        Object object2;
                        d0 d08 = object2;
                        object2 = (ComponentName)e0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)object, ComponentName.CREATOR);
                        String string6 = object.readString();
                        IBinder iBinder = ((w3)d08).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((ComponentName)object2, string6);
                        parcel.writeNoException();
                        parcel.writeStrongBinder(iBinder);
                        break;
                    }
                    case 7: {
                        Object object2;
                        IBinder iBinder = object.readStrongBinder();
                        Parcelable.Creator creator = Intent.CREATOR;
                        creator = (Intent)(object.readInt() != 0 ? creator.createFromParcel((Parcel)object) : null);
                        Object object3 = object2;
                        object2 = object.readStrongBinder();
                        int n16 = ((w3)object3).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(iBinder, (Intent)creator, (IBinder)object2);
                        parcel.writeNoException();
                        parcel.writeInt(n16);
                        break;
                    }
                    case 6: {
                        Object object2;
                        d0 d09 = object2;
                        object2 = object.readStrongBinder();
                        int n17 = ((w3)d09).\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988((IBinder)object2);
                        parcel.writeNoException();
                        parcel.writeInt(n17);
                        break;
                    }
                    case 5: {
                        Object object2;
                        d0 d010 = object2;
                        object2 = (Intent)e0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)object, Intent.CREATOR);
                        IBinder iBinder = object.readStrongBinder();
                        object = object.readString();
                        int n18 = ((w3)d010).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403((Intent)object2, iBinder, (String)object);
                        parcel.writeNoException();
                        parcel.writeInt(n18);
                        break;
                    }
                    case 4: {
                        Object object2;
                        d0 d011 = object2;
                        object2 = (ComponentName)e0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)object, ComponentName.CREATOR);
                        IBinder iBinder = object.readStrongBinder();
                        int n22 = object.readInt();
                        int n19 = ((w3)d011).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((ComponentName)object2, iBinder, n22);
                        parcel.writeNoException();
                        parcel.writeInt(n19);
                        break;
                    }
                    case 3: {
                        Object object2;
                        d0 d012 = object2;
                        object2 = (Intent)e0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)object, Intent.CREATOR);
                        String string7 = object.readString();
                        int n20 = ((w3)d012).\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988((Intent)object2, string7);
                        parcel.writeNoException();
                        parcel.writeInt(n20);
                        break;
                    }
                    case 2: {
                        Object object2;
                        d0 d013 = object2;
                        object2 = (Intent)e0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)object, Intent.CREATOR);
                        String string8 = object.readString();
                        object2 = ((w3)d013).\u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a((Intent)object2, string8);
                        parcel.writeNoException();
                        int n25 = 1;
                        if (object2 != null) {
                            parcel.writeInt(1);
                            object2.writeToParcel(parcel, n25);
                            break;
                        }
                        parcel.writeInt(0);
                        break;
                    }
                    case 1: {
                        Object object2;
                        String string9 = object.readString();
                        String string10 = object.readString();
                        n12 = object.readInt();
                        if (n12 > 1000000) break block26;
                        ProviderInfo[] providerInfoArray = n12 < 0 ? null : new ProviderInfo[n12];
                        n13 = object.readInt();
                        if (n13 > 1000000) break block27;
                        String[] stringArray = n13 < 0 ? null : new String[n13];
                        int n26 = object.readInt();
                        IBinder iBinder = ((w3)object2).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(string9, string10, providerInfoArray, stringArray, n26);
                        parcel.writeNoException();
                        parcel.writeStrongBinder(iBinder);
                        parcel.writeTypedArray((Parcelable[])providerInfoArray, 1);
                        parcel.writeStringArray(stringArray);
                    }
                }
                return true;
            }
            throw new BadParcelableException("Array too large: " + n13);
        }
        throw new BadParcelableException("Array too large: " + n12);
    }
}

