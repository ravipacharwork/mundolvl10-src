/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.accounts.AuthenticatorDescription
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 */
package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;
import top.bienvenido.date_24323.b0;

public final class y
implements b0 {
    public final IBinder \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;

    public y(IBinder iBinder) {
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = iBinder;
    }

    public final IBinder asBinder() {
        return this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String \u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988(Account account) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoAccountManagerService");
        int n10 = 0;
        if (account != null) {
            parcel.writeInt(1);
            account.writeToParcel(parcel, n10);
        } else {
            parcel.writeInt(0);
        }
        Parcel parcel3 = parcel2;
        Parcel parcel4 = parcel3;
        Parcel parcel5 = parcel3;
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(1, parcel, parcel2, 0);
        try {
            parcel4.readException();
            return parcel5.readString();
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String \u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988(Account account, String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoAccountManagerService");
        int n10 = 0;
        if (account != null) {
            parcel.writeInt(1);
            account.writeToParcel(parcel, n10);
        } else {
            parcel.writeInt(0);
        }
        Parcel parcel3 = parcel2;
        Parcel parcel4 = parcel3;
        Parcel parcel5 = parcel3;
        parcel.writeString(string);
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(2, parcel, parcel2, 0);
        try {
            parcel4.readException();
            return parcel5.readString();
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    @Override
    public final AuthenticatorDescription[] \u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoAccountManagerService");
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(3, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        AuthenticatorDescription[] authenticatorDescriptionArray = (AuthenticatorDescription[])parcel2.createTypedArray(AuthenticatorDescription.CREATOR);
        parcel2.recycle();
        parcel.recycle();
        return authenticatorDescriptionArray;
    }

    @Override
    public final Account[] \u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c() {
        String string = null;
        int n10 = 0;
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoAccountManagerService");
            parcel.writeString(string);
            parcel.writeInt(n10);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(4, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        Account[] accountArray = (Account[])parcel2.createTypedArray(Account.CREATOR);
        parcel2.recycle();
        parcel.recycle();
        return accountArray;
    }

    @Override
    public final Account[] \u808f\u4f60\u5988\u5c0f\u5c44\u5d3d\u5b50\u4f60\u771f\u6ca1\u89c1\u8fc7\u9ed1\u793e\u4f1a\u54c8\u808f\u4f60\u5988\u7684\u6562\u4e0d\u6562\u8ddf\u6211\u6bd4\u5212\u6bd4\u5212\u808f\u4f60\u5988\u808f\u4f60\u5988\u6562\u4e0d\u6562\u6bd4\u5212\u4ec0\u4e48\u53eb\u505a\u9ed1\u624b\u808f\u4f60\u5988\u7684\u4f60(String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoAccountManagerService");
            parcel.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(5, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        Account[] accountArray = (Account[])parcel2.createTypedArray(Account.CREATOR);
        parcel2.recycle();
        parcel.recycle();
        return accountArray;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, Account account, String[] stringArray) {
        IBinder iBinder2;
        IBinder iBinder3;
        Parcel parcel;
        Parcel parcel2 = Parcel.obtain();
        IBinder iBinder4 = iBinder;
        iBinder = Parcel.obtain();
        try {
            parcel2.writeInterfaceToken("MundoAccountManagerService");
            parcel2.writeStrongBinder(iBinder4);
            int n10 = 0;
            if (account != null) {
                parcel2.writeInt(1);
                account.writeToParcel(parcel2, n10);
            } else {
                parcel2.writeInt(0);
            }
            parcel = parcel2;
            IBinder iBinder5 = iBinder;
            iBinder3 = iBinder5;
            iBinder2 = iBinder5;
            parcel2.writeStringArray(stringArray);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(6, parcel2, (Parcel)iBinder, 0);
        }
        catch (Throwable throwable) {
            iBinder.recycle();
            parcel2.recycle();
            throw throwable;
        }
        {
            iBinder3.readException();
        }
        iBinder2.recycle();
        parcel.recycle();
    }

    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, String string, String[] stringArray) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoAccountManagerService");
            parcel.writeStrongBinder(iBinder);
            parcel.writeString(string);
            parcel.writeStringArray(stringArray);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(7, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        parcel2.recycle();
        parcel.recycle();
    }

    @Override
    public final void \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(IBinder iBinder, String string, String[] stringArray) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoAccountManagerService");
            parcel.writeStrongBinder(iBinder);
            parcel.writeString(string);
            parcel.writeStringArray(stringArray);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(8, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        parcel2.recycle();
        parcel.recycle();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, Account account, boolean bl) {
        IBinder iBinder2;
        IBinder iBinder3;
        Parcel parcel;
        Parcel parcel2 = Parcel.obtain();
        IBinder iBinder4 = iBinder;
        iBinder = Parcel.obtain();
        try {
            parcel2.writeInterfaceToken("MundoAccountManagerService");
            parcel2.writeStrongBinder(iBinder4);
            int n10 = 0;
            if (account != null) {
                parcel2.writeInt(1);
                account.writeToParcel(parcel2, n10);
            } else {
                parcel2.writeInt(0);
            }
            parcel = parcel2;
            IBinder iBinder5 = iBinder;
            iBinder3 = iBinder5;
            iBinder2 = iBinder5;
            parcel2.writeInt(bl ? 1 : 0);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(9, parcel2, (Parcel)iBinder, 0);
        }
        catch (Throwable throwable) {
            iBinder.recycle();
            parcel2.recycle();
            throw throwable;
        }
        {
            iBinder3.readException();
        }
        iBinder2.recycle();
        parcel.recycle();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Account account) {
        boolean bl;
        Parcel parcel;
        Parcel parcel2;
        Parcel parcel3 = Parcel.obtain();
        Parcel parcel4 = Parcel.obtain();
        try {
            parcel3.writeInterfaceToken("MundoAccountManagerService");
            int n10 = 0;
            if (account != null) {
                Parcel parcel5 = parcel3;
                parcel5.writeInt(1);
                account.writeToParcel(parcel5, n10);
            } else {
                parcel3.writeInt(0);
            }
            Parcel parcel6 = parcel4;
            parcel2 = parcel6;
            parcel = parcel6;
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(10, parcel3, parcel4, 0);
        }
        catch (Throwable throwable) {
            parcel4.recycle();
            parcel3.recycle();
            throw throwable;
        }
        {
            parcel2.readException();
            bl = parcel.readInt() != 0;
        }
        parcel4.recycle();
        parcel3.recycle();
        return bl;
    }

    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(String string, String string2) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoAccountManagerService");
            parcel.writeString(string);
            parcel.writeString(string2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(11, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        parcel2.recycle();
        parcel.recycle();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(Account account, String string) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        parcel.writeInterfaceToken("MundoAccountManagerService");
        int n10 = 0;
        if (account != null) {
            parcel.writeInt(1);
            account.writeToParcel(parcel, n10);
        } else {
            parcel.writeInt(0);
        }
        Parcel parcel3 = parcel2;
        Parcel parcel4 = parcel3;
        Parcel parcel5 = parcel3;
        parcel.writeString(string);
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(12, parcel, parcel2, 0);
        try {
            parcel4.readException();
            return parcel5.readString();
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(Account account, String string, String string2) {
        Parcel parcel;
        Parcel parcel2;
        Parcel parcel3;
        Parcel parcel4 = Parcel.obtain();
        Parcel parcel5 = Parcel.obtain();
        try {
            parcel4.writeInterfaceToken("MundoAccountManagerService");
            int n10 = 0;
            if (account != null) {
                parcel4.writeInt(1);
                account.writeToParcel(parcel4, n10);
            } else {
                parcel4.writeInt(0);
            }
            parcel3 = parcel4;
            Parcel parcel6 = parcel5;
            parcel2 = parcel6;
            parcel = parcel6;
            parcel4.writeString(string);
            parcel4.writeString(string2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(13, parcel4, parcel5, 0);
        }
        catch (Throwable throwable) {
            parcel5.recycle();
            parcel4.recycle();
            throw throwable;
        }
        {
            parcel2.readException();
        }
        parcel.recycle();
        parcel3.recycle();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Account account, String string) {
        Parcel parcel;
        Parcel parcel2;
        Parcel parcel3;
        Parcel parcel4 = Parcel.obtain();
        Parcel parcel5 = Parcel.obtain();
        try {
            parcel4.writeInterfaceToken("MundoAccountManagerService");
            int n10 = 0;
            if (account != null) {
                parcel4.writeInt(1);
                account.writeToParcel(parcel4, n10);
            } else {
                parcel4.writeInt(0);
            }
            parcel3 = parcel4;
            Parcel parcel6 = parcel5;
            parcel2 = parcel6;
            parcel = parcel6;
            parcel4.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(14, parcel4, parcel5, 0);
        }
        catch (Throwable throwable) {
            parcel5.recycle();
            parcel4.recycle();
            throw throwable;
        }
        {
            parcel2.readException();
        }
        parcel.recycle();
        parcel3.recycle();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Account account, String string, String string2) {
        Parcel parcel;
        Parcel parcel2;
        Parcel parcel3;
        Parcel parcel4 = Parcel.obtain();
        Parcel parcel5 = Parcel.obtain();
        try {
            parcel4.writeInterfaceToken("MundoAccountManagerService");
            int n10 = 0;
            if (account != null) {
                parcel4.writeInt(1);
                account.writeToParcel(parcel4, n10);
            } else {
                parcel4.writeInt(0);
            }
            parcel3 = parcel4;
            Parcel parcel6 = parcel5;
            parcel2 = parcel6;
            parcel = parcel6;
            parcel4.writeString(string);
            parcel4.writeString(string2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(15, parcel4, parcel5, 0);
        }
        catch (Throwable throwable) {
            parcel5.recycle();
            parcel4.recycle();
            throw throwable;
        }
        {
            parcel2.readException();
        }
        parcel.recycle();
        parcel3.recycle();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, Account account, String string, boolean bl, boolean bl2, Bundle bundle) {
        IBinder iBinder2;
        IBinder iBinder3;
        Parcel parcel;
        Parcel parcel2 = Parcel.obtain();
        IBinder iBinder4 = iBinder;
        iBinder = Parcel.obtain();
        try {
            parcel2.writeInterfaceToken("MundoAccountManagerService");
            parcel2.writeStrongBinder(iBinder4);
            int n10 = 0;
            if (account != null) {
                parcel2.writeInt(1);
                account.writeToParcel(parcel2, n10);
            } else {
                parcel2.writeInt(0);
            }
            Parcel parcel3 = parcel2;
            parcel3.writeString(string);
            parcel3.writeInt(bl ? 1 : 0);
            parcel3.writeInt(bl2 ? 1 : 0);
            int n11 = 0;
            if (bundle != null) {
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, n11);
            } else {
                parcel2.writeInt(0);
            }
            parcel = parcel2;
            IBinder iBinder5 = iBinder;
            iBinder3 = iBinder5;
            iBinder2 = iBinder5;
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(16, parcel2, (Parcel)iBinder, 0);
        }
        catch (Throwable throwable) {
            iBinder.recycle();
            parcel2.recycle();
            throw throwable;
        }
        {
            iBinder3.readException();
        }
        iBinder2.recycle();
        parcel.recycle();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, String string, String string2, String[] stringArray, boolean bl, Bundle bundle) {
        IBinder iBinder2;
        IBinder iBinder3;
        Parcel parcel;
        Parcel parcel2 = Parcel.obtain();
        IBinder iBinder4 = iBinder;
        iBinder = Parcel.obtain();
        try {
            parcel2.writeInterfaceToken("MundoAccountManagerService");
            parcel2.writeStrongBinder(iBinder4);
            parcel2.writeString(string);
            parcel2.writeString(string2);
            parcel2.writeStringArray(stringArray);
            parcel2.writeInt(bl ? 1 : 0);
            int n10 = 0;
            if (bundle != null) {
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, n10);
            } else {
                parcel2.writeInt(0);
            }
            parcel = parcel2;
            IBinder iBinder5 = iBinder;
            iBinder3 = iBinder5;
            iBinder2 = iBinder5;
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(17, parcel2, (Parcel)iBinder, 0);
        }
        catch (Throwable throwable) {
            iBinder.recycle();
            parcel2.recycle();
            throw throwable;
        }
        {
            iBinder3.readException();
        }
        iBinder2.recycle();
        parcel.recycle();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, Account account, String string, boolean bl, Bundle bundle) {
        IBinder iBinder2;
        IBinder iBinder3;
        Parcel parcel;
        Parcel parcel2 = Parcel.obtain();
        IBinder iBinder4 = iBinder;
        iBinder = Parcel.obtain();
        try {
            parcel2.writeInterfaceToken("MundoAccountManagerService");
            parcel2.writeStrongBinder(iBinder4);
            int n10 = 0;
            if (account != null) {
                parcel2.writeInt(1);
                account.writeToParcel(parcel2, n10);
            } else {
                parcel2.writeInt(0);
            }
            Parcel parcel3 = parcel2;
            parcel3.writeString(string);
            parcel3.writeInt(bl ? 1 : 0);
            int n11 = 0;
            if (bundle != null) {
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, n11);
            } else {
                parcel2.writeInt(0);
            }
            parcel = parcel2;
            IBinder iBinder5 = iBinder;
            iBinder3 = iBinder5;
            iBinder2 = iBinder5;
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(18, parcel2, (Parcel)iBinder, 0);
        }
        catch (Throwable throwable) {
            iBinder.recycle();
            parcel2.recycle();
            throw throwable;
        }
        {
            iBinder3.readException();
        }
        iBinder2.recycle();
        parcel.recycle();
    }

    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, String string, boolean bl) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoAccountManagerService");
            parcel.writeStrongBinder(iBinder);
            parcel.writeString(string);
            parcel.writeInt(bl ? 1 : 0);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(19, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        parcel2.recycle();
        parcel.recycle();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, Account account, Bundle bundle, boolean bl) {
        IBinder iBinder2;
        IBinder iBinder3;
        Parcel parcel;
        Parcel parcel2 = Parcel.obtain();
        IBinder iBinder4 = iBinder;
        iBinder = Parcel.obtain();
        try {
            parcel2.writeInterfaceToken("MundoAccountManagerService");
            parcel2.writeStrongBinder(iBinder4);
            int n10 = 0;
            if (account != null) {
                parcel2.writeInt(1);
                account.writeToParcel(parcel2, n10);
            } else {
                parcel2.writeInt(0);
            }
            int n11 = 0;
            if (bundle != null) {
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, n11);
            } else {
                parcel2.writeInt(0);
            }
            parcel = parcel2;
            IBinder iBinder5 = iBinder;
            iBinder3 = iBinder5;
            iBinder2 = iBinder5;
            parcel2.writeInt(bl ? 1 : 0);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(20, parcel2, (Parcel)iBinder, 0);
        }
        catch (Throwable throwable) {
            iBinder.recycle();
            parcel2.recycle();
            throw throwable;
        }
        {
            iBinder3.readException();
        }
        iBinder2.recycle();
        parcel.recycle();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(Account account) {
        boolean bl;
        Parcel parcel;
        Parcel parcel2;
        Parcel parcel3 = Parcel.obtain();
        Parcel parcel4 = Parcel.obtain();
        try {
            parcel3.writeInterfaceToken("MundoAccountManagerService");
            int n10 = 0;
            if (account != null) {
                Parcel parcel5 = parcel3;
                parcel5.writeInt(1);
                account.writeToParcel(parcel5, n10);
            } else {
                parcel3.writeInt(0);
            }
            Parcel parcel6 = parcel4;
            parcel2 = parcel6;
            parcel = parcel6;
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(21, parcel3, parcel4, 0);
        }
        catch (Throwable throwable) {
            parcel4.recycle();
            parcel3.recycle();
            throw throwable;
        }
        {
            parcel2.readException();
            bl = parcel.readInt() != 0;
        }
        parcel4.recycle();
        parcel3.recycle();
        return bl;
    }

    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, String string, String string2) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoAccountManagerService");
            parcel.writeStrongBinder(iBinder);
            parcel.writeString(string);
            parcel.writeString(string2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(22, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        parcel2.recycle();
        parcel.recycle();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, Account account, String string) {
        IBinder iBinder2;
        IBinder iBinder3;
        Parcel parcel;
        Parcel parcel2 = Parcel.obtain();
        IBinder iBinder4 = iBinder;
        iBinder = Parcel.obtain();
        try {
            parcel2.writeInterfaceToken("MundoAccountManagerService");
            parcel2.writeStrongBinder(iBinder4);
            int n10 = 0;
            if (account != null) {
                parcel2.writeInt(1);
                account.writeToParcel(parcel2, n10);
            } else {
                parcel2.writeInt(0);
            }
            parcel = parcel2;
            IBinder iBinder5 = iBinder;
            iBinder3 = iBinder5;
            iBinder2 = iBinder5;
            parcel2.writeString(string);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(23, parcel2, (Parcel)iBinder, 0);
        }
        catch (Throwable throwable) {
            iBinder.recycle();
            parcel2.recycle();
            throw throwable;
        }
        {
            iBinder3.readException();
        }
        iBinder2.recycle();
        parcel.recycle();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IBinder iBinder, Account account) {
        IBinder iBinder2;
        IBinder iBinder3;
        Parcel parcel;
        Parcel parcel2 = Parcel.obtain();
        IBinder iBinder4 = iBinder;
        iBinder = Parcel.obtain();
        try {
            parcel2.writeInterfaceToken("MundoAccountManagerService");
            parcel2.writeStrongBinder(iBinder4);
            int n10 = 0;
            if (account != null) {
                parcel2.writeInt(1);
                account.writeToParcel(parcel2, n10);
            } else {
                parcel2.writeInt(0);
            }
            parcel = parcel2;
            IBinder iBinder5 = iBinder;
            iBinder3 = iBinder5;
            iBinder2 = iBinder5;
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(24, parcel2, (Parcel)iBinder, 0);
        }
        catch (Throwable throwable) {
            iBinder.recycle();
            parcel2.recycle();
            throw throwable;
        }
        {
            iBinder3.readException();
        }
        iBinder2.recycle();
        parcel.recycle();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Account account, String string, Bundle bundle, Map map) {
        boolean bl;
        Parcel parcel;
        Parcel parcel2;
        Parcel parcel3 = Parcel.obtain();
        Parcel parcel4 = Parcel.obtain();
        try {
            parcel3.writeInterfaceToken("MundoAccountManagerService");
            int n10 = 0;
            if (account != null) {
                Parcel parcel5 = parcel3;
                parcel5.writeInt(1);
                account.writeToParcel(parcel5, n10);
            } else {
                parcel3.writeInt(0);
            }
            parcel3.writeString(string);
            int n11 = 0;
            if (bundle != null) {
                Parcel parcel6 = parcel3;
                parcel6.writeInt(1);
                bundle.writeToParcel(parcel6, n11);
            } else {
                parcel3.writeInt(0);
            }
            Parcel parcel7 = parcel4;
            parcel2 = parcel7;
            parcel = parcel7;
            parcel3.writeMap(map);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(25, parcel3, parcel4, 0);
        }
        catch (Throwable throwable) {
            parcel4.recycle();
            parcel3.recycle();
            throw throwable;
        }
        {
            parcel2.readException();
            bl = parcel.readInt() != 0;
        }
        parcel4.recycle();
        parcel3.recycle();
        return bl;
    }

    @Override
    public final HashMap \u5b59\u7acb\u519b\u7981\u64ad\u4f60\u5988\u4e0b\u4f53\u4e43\u662f\u6b63\u4e49\u4e4b\u4e3e\u6b64\u4e3e\u5f15\u5f97\u65e0\u6570\u7231\u56fd\u4eba\u58eb\u51b2\u8fdb\u4f60\u5988\u4e0b\u4f53\u4e00\u987f\u6253\u7838\u4ece\u6b64\u4f60\u5988\u5356\u903c\u4e5f\u6ca1\u7528\u597d\u53e3\u7891\u4e86(String string, String string2) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("MundoAccountManagerService");
            parcel.writeString(string);
            parcel.writeString(string2);
            this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.transact(26, parcel, parcel2, 0);
        }
        catch (Throwable throwable) {
            parcel2.recycle();
            parcel.recycle();
            throw throwable;
        }
        parcel2.readException();
        HashMap hashMap = parcel2.readHashMap(y.class.getClassLoader());
        parcel2.recycle();
        parcel.recycle();
        return hashMap;
    }
}

