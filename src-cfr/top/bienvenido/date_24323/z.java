/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.accounts.AuthenticatorDescription
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import top.bienvenido.date_24323.a0;
import top.bienvenido.date_24323.b0;
import top.bienvenido.date_24323.m3;

public abstract class z
extends Binder
implements b0 {
    public static final /* synthetic */ int \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;

    public z() {
        z z10 = this;
        z10.attachInterface(this, "MundoAccountManagerService");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int n10, Parcel bundle, Parcel parcel, int n11) {
        String string = "MundoAccountManagerService";
        if (n10 >= 1 && n10 <= 0xFFFFFF) {
            bundle.enforceInterface(string);
        }
        if (n10 == 1598968902) {
            parcel.writeString(string);
            return true;
        }
        switch (n10) {
            default: {
                z z10;
                return super.onTransact(n10, (Parcel)bundle, parcel, n11);
            }
            case 26: {
                z z10;
                String string2 = bundle.readString();
                HashMap hashMap = ((m3)z10).\u5b59\u7acb\u519b\u7981\u64ad\u4f60\u5988\u4e0b\u4f53\u4e43\u662f\u6b63\u4e49\u4e4b\u4e3e\u6b64\u4e3e\u5f15\u5f97\u65e0\u6570\u7231\u56fd\u4eba\u58eb\u51b2\u8fdb\u4f60\u5988\u4e0b\u4f53\u4e00\u987f\u6253\u7838\u4ece\u6b64\u4f60\u5988\u5356\u903c\u4e5f\u6ca1\u7528\u597d\u53e3\u7891\u4e86(bundle.readString(), string2);
                parcel.writeNoException();
                parcel.writeMap((Map)hashMap);
                break;
            }
            case 25: {
                z z10;
                Account account = (Account)a0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)bundle, Account.CREATOR);
                String string3 = bundle.readString();
                string = Bundle.CREATOR;
                string = (Bundle)(bundle.readInt() != 0 ? string.createFromParcel((Parcel)bundle) : null);
                bundle = bundle.readHashMap(z10.getClass().getClassLoader());
                int n12 = ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(account, string3, (Bundle)string, (Map)bundle);
                parcel.writeNoException();
                parcel.writeInt(n12);
                break;
            }
            case 24: {
                z z10;
                IBinder iBinder = bundle.readStrongBinder();
                Parcelable.Creator creator = Account.CREATOR;
                bundle = (Account)(bundle.readInt() != 0 ? creator.createFromParcel((Parcel)bundle) : null);
                ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(iBinder, (Account)bundle);
                parcel.writeNoException();
                break;
            }
            case 23: {
                z z10;
                IBinder iBinder = bundle.readStrongBinder();
                Parcelable.Creator creator = Account.CREATOR;
                creator = (Account)(bundle.readInt() != 0 ? creator.createFromParcel((Parcel)bundle) : null);
                bundle = bundle.readString();
                ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(iBinder, (Account)creator, (String)bundle);
                parcel.writeNoException();
                break;
            }
            case 22: {
                z z10;
                IBinder iBinder = bundle.readStrongBinder();
                String string4 = bundle.readString();
                bundle = bundle.readString();
                ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(iBinder, string4, (String)bundle);
                parcel.writeNoException();
                break;
            }
            case 21: {
                z z10;
                int n13 = ((m3)z10).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403((Account)a0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)bundle, Account.CREATOR));
                parcel.writeNoException();
                parcel.writeInt(n13);
                break;
            }
            case 20: {
                z z10;
                IBinder iBinder = bundle.readStrongBinder();
                Parcelable.Creator creator = Account.CREATOR;
                creator = (Account)(bundle.readInt() != 0 ? creator.createFromParcel((Parcel)bundle) : null);
                string = Bundle.CREATOR;
                string = (Bundle)(bundle.readInt() != 0 ? string.createFromParcel((Parcel)bundle) : null);
                boolean bl = bundle.readInt() != 0;
                ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(iBinder, (Account)creator, (Bundle)string, bl);
                parcel.writeNoException();
                break;
            }
            case 19: {
                z z10;
                IBinder iBinder = bundle.readStrongBinder();
                String string5 = bundle.readString();
                boolean bl = bundle.readInt() != 0;
                ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(iBinder, string5, bl);
                parcel.writeNoException();
                break;
            }
            case 18: {
                z z10;
                IBinder iBinder = bundle.readStrongBinder();
                Parcelable.Creator creator = Account.CREATOR;
                creator = (Account)(bundle.readInt() != 0 ? creator.createFromParcel((Parcel)bundle) : null);
                string = bundle.readString();
                boolean bl = bundle.readInt() != 0;
                Parcelable.Creator creator2 = Bundle.CREATOR;
                bundle = (Bundle)(bundle.readInt() != 0 ? creator2.createFromParcel((Parcel)bundle) : null);
                ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(iBinder, (Account)creator, string, bl, bundle);
                parcel.writeNoException();
                break;
            }
            case 17: {
                z z10;
                IBinder iBinder = bundle.readStrongBinder();
                String string6 = bundle.readString();
                string = bundle.readString();
                String[] stringArray = bundle.createStringArray();
                boolean bl = bundle.readInt() != 0;
                Parcelable.Creator creator = Bundle.CREATOR;
                bundle = (Bundle)(bundle.readInt() != 0 ? creator.createFromParcel((Parcel)bundle) : null);
                ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(iBinder, string6, string, stringArray, bl, bundle);
                parcel.writeNoException();
                break;
            }
            case 16: {
                z z10;
                IBinder iBinder = bundle.readStrongBinder();
                Parcelable.Creator creator = Account.CREATOR;
                creator = (Account)(bundle.readInt() != 0 ? creator.createFromParcel((Parcel)bundle) : null);
                string = bundle.readString();
                boolean bl = bundle.readInt() != 0;
                boolean bl2 = bundle.readInt() != 0;
                Parcelable.Creator creator3 = Bundle.CREATOR;
                bundle = (Bundle)(bundle.readInt() != 0 ? creator3.createFromParcel((Parcel)bundle) : null);
                ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(iBinder, (Account)creator, string, bl, bl2, bundle);
                parcel.writeNoException();
                break;
            }
            case 15: {
                z z10;
                Account account = (Account)a0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)bundle, Account.CREATOR);
                String string7 = bundle.readString();
                bundle = bundle.readString();
                ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(account, string7, (String)bundle);
                parcel.writeNoException();
                break;
            }
            case 14: {
                z z10;
                String string8 = bundle.readString();
                ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Account)a0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)bundle, Account.CREATOR), string8);
                parcel.writeNoException();
                break;
            }
            case 13: {
                z z10;
                Account account = (Account)a0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)bundle, Account.CREATOR);
                String string9 = bundle.readString();
                bundle = bundle.readString();
                ((m3)z10).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(account, string9, (String)bundle);
                parcel.writeNoException();
                break;
            }
            case 12: {
                z z10;
                String string10 = bundle.readString();
                String string2 = ((m3)z10).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403((Account)a0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)bundle, Account.CREATOR), string10);
                parcel.writeNoException();
                parcel.writeString(string2);
                break;
            }
            case 11: {
                z z10;
                String string12 = bundle.readString();
                ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(bundle.readString(), string12);
                parcel.writeNoException();
                break;
            }
            case 10: {
                z z10 = (Account)a0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)bundle, Account.CREATOR);
                int n14 = z10 == null ? 0 : m3.\u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403((Account)z10);
                parcel.writeNoException();
                parcel.writeInt(n14);
                break;
            }
            case 9: {
                z z10;
                IBinder iBinder = bundle.readStrongBinder();
                Parcelable.Creator creator = Account.CREATOR;
                creator = (Account)(bundle.readInt() != 0 ? creator.createFromParcel((Parcel)bundle) : null);
                boolean bl = bundle.readInt() != 0;
                ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(iBinder, (Account)creator, bl);
                parcel.writeNoException();
                break;
            }
            case 8: {
                z z10;
                IBinder iBinder = bundle.readStrongBinder();
                String string13 = bundle.readString();
                bundle = bundle.createStringArray();
                ((m3)z10).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(iBinder, string13, (String[])bundle);
                parcel.writeNoException();
                break;
            }
            case 7: {
                z z10;
                IBinder iBinder = bundle.readStrongBinder();
                String string14 = bundle.readString();
                bundle = bundle.createStringArray();
                ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(iBinder, string14, (String[])bundle);
                parcel.writeNoException();
                break;
            }
            case 6: {
                z z10;
                IBinder iBinder = bundle.readStrongBinder();
                Parcelable.Creator creator = Account.CREATOR;
                creator = (Account)(bundle.readInt() != 0 ? creator.createFromParcel((Parcel)bundle) : null);
                bundle = bundle.createStringArray();
                ((m3)z10).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(iBinder, (Account)creator, (String[])bundle);
                parcel.writeNoException();
                break;
            }
            case 5: {
                z z10;
                Account[] accountArray = ((m3)z10).\u808f\u4f60\u5988\u5c0f\u5c44\u5d3d\u5b50\u4f60\u771f\u6ca1\u89c1\u8fc7\u9ed1\u793e\u4f1a\u54c8\u808f\u4f60\u5988\u7684\u6562\u4e0d\u6562\u8ddf\u6211\u6bd4\u5212\u6bd4\u5212\u808f\u4f60\u5988\u808f\u4f60\u5988\u6562\u4e0d\u6562\u6bd4\u5212\u4ec0\u4e48\u53eb\u505a\u9ed1\u624b\u808f\u4f60\u5988\u7684\u4f60(bundle.readString());
                parcel.writeNoException();
                parcel.writeTypedArray((Parcelable[])accountArray, 1);
                break;
            }
            case 4: {
                z z10;
                bundle.readString();
                bundle.readInt();
                Account[] accountArray = ((m3)z10).\u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c();
                parcel.writeNoException();
                parcel.writeTypedArray((Parcelable[])accountArray, 1);
                break;
            }
            case 3: {
                z z10;
                AuthenticatorDescription[] authenticatorDescriptionArray = ((m3)z10).\u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a();
                parcel.writeNoException();
                parcel.writeTypedArray((Parcelable[])authenticatorDescriptionArray, 1);
                break;
            }
            case 2: {
                z z10;
                String string15 = bundle.readString();
                String string3 = ((m3)z10).\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988((Account)a0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)bundle, Account.CREATOR), string15);
                parcel.writeNoException();
                parcel.writeString(string3);
                break;
            }
            case 1: {
                z z10;
                String string4 = ((m3)z10).\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988((Account)a0.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Parcel)bundle, Account.CREATOR));
                parcel.writeNoException();
                parcel.writeString(string4);
            }
        }
        return true;
    }
}

